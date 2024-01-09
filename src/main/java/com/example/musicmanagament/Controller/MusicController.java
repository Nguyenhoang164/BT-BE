package com.example.musicmanagament.Controller;

import com.example.musicmanagament.Model.Music;
import com.example.musicmanagament.Model.MusicForm;
import com.example.musicmanagament.Service.HibernateMusicService;
import com.example.musicmanagament.Service.IMusicService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    public IMusicService musicService = new HibernateMusicService();
    @Value("${file-upload}")
    private String fileUpload;
    @GetMapping("")
    public String index(Model model){
        List<Music> musicList = musicService.findAll();
        model.addAttribute("musicList",musicList);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("music",new Music());
        return "/create";
    }
    @PostMapping("/save")
    public String save(MusicForm musicForm){
        MultipartFile multipartFile = musicForm.getMultipartFile();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(musicForm.getMultipartFile().getBytes(),new File(fileUpload + fileName));
        }catch (IOException e){
            e.printStackTrace();
        }
        Music music = new Music(musicForm.getId(),musicForm.getNameSong(),musicForm.getAuthor(),musicForm.getKindMusic(),fileName);
        musicService.save(music);
        return "redirect:/music";
    }
    @GetMapping("/{id}/edit")
    public String update(@PathVariable int id , Model model){
        model.addAttribute("music",musicService.findById(id));
        return "/update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("music") Music music){
        musicService.save(music);
        return "redirect:/music";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id , Model model){
        model.addAttribute("music",musicService.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(Music music){
        musicService.remove(music.getId());
        return "redirect:/music";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id , Model model){
        model.addAttribute("music",musicService.findById(id));
        return "/view";
    }

}

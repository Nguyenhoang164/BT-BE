package com.example.checkemailbymaven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class CheckTimeController {

    @GetMapping("/checkTime")
    public String checkTime(@RequestParam String city, Model model) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = "";

        switch (city) {
            case "HN":
                ZoneId hanoiZone = ZoneId.of("Asia/Ho_Chi_Minh");
                ZonedDateTime localDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault());
                ZonedDateTime hanoiDateTime = localDateTime.withZoneSameInstant(hanoiZone);
                LocalDateTime hanoiTime = hanoiDateTime.toLocalDateTime();
                formattedTime = hanoiTime.format(formatter);
                break;
            case "London":
                ZoneId londonZone = ZoneId.of("Europe/London");
                ZonedDateTime londonLocalDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault());
                ZonedDateTime londonDateTime = londonLocalDateTime.withZoneSameInstant(londonZone);
                LocalDateTime londonTime = londonDateTime.toLocalDateTime();
                formattedTime = londonTime.format(formatter);
                break;
            case "US":
                ZoneId usZone = ZoneId.of("America/New_York");
                ZonedDateTime usLocalDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault());
                ZonedDateTime usDateTime = usLocalDateTime.withZoneSameInstant(usZone);
                LocalDateTime usTime = usDateTime.toLocalDateTime();
                formattedTime = usTime.format(formatter);
                break;
        }

        model.addAttribute("time", formattedTime);
        return "CheckTimeCity";
    }

    @GetMapping("/Time")
    public String showCheckTime() {
        return "CheckTimeCity";
    }
}
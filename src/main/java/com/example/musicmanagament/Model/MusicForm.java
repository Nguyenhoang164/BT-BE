package com.example.musicmanagament.Model;

import org.springframework.web.multipart.MultipartFile;

public class MusicForm {
    private int id;
    private String nameSong;
    private String author;
    private String kindMusic;
    private MultipartFile multipartFile;

    public MusicForm(int id, String nameSong, String author, String kindMusic, MultipartFile multipartFile) {
        this.id = id;
        this.nameSong = nameSong;
        this.author = author;
        this.kindMusic = kindMusic;
        this.multipartFile = multipartFile;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getKindMusic() {
        return kindMusic;
    }

    public void setKindMusic(String kindMusic) {
        this.kindMusic = kindMusic;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


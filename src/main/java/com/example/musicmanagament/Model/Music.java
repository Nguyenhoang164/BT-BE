package com.example.musicmanagament.Model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Music() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    private String nameSong;
    private String author;
    private String kindMusic;
    private String multipartFile;

    public Music(int id, String nameSong, String author, String kindMusic, String multipartFile) {
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

    public String getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(String multipartFile) {
        this.multipartFile = multipartFile;
    }
}


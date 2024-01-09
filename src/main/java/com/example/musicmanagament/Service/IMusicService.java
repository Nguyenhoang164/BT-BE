package com.example.musicmanagament.Service;

import com.example.musicmanagament.Model.Music;
import com.example.musicmanagament.Model.MusicForm;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    Music findById(int id);

    void remove(int id);
}

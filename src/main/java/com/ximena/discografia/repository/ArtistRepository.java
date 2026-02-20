package com.ximena.discografia.repository;

import com.ximena.discografia.model.Artist;

import java.util.List;

public interface ArtistRepository {

    List<Artist> findAll();
    void save(Artist artist);
    Artist findById(int id);
    void deleteById(int id);
    boolean exists(Artist artist);
    Artist findByName(String name);

}

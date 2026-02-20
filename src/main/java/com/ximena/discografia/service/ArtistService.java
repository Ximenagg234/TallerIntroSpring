package com.ximena.discografia.service;
import com.ximena.discografia.model.Artist;
import java.util.List;

public interface ArtistService {

    List<Artist> getAllArtists();
    void createArtist(Artist artist);
    Artist getArtistWithTracks(String name);
    void deleteArtist(int id);
}

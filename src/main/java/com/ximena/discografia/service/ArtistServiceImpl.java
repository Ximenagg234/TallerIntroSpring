package com.ximena.discografia.service;

import com.ximena.discografia.model.Artist;
import com.ximena.discografia.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    private ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    public void createArtist(Artist artist) {
        artistRepository.save(artist);
    }

    @Override
    public Artist getArtistWithTracks(String name) {
        return artistRepository.findByName(name);
    }

    @Override
    public void deleteArtist(int id) {
        artistRepository.deleteById(id);
    }
}

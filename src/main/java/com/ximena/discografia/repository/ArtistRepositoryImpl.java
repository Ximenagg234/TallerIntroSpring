package com.ximena.discografia.repository;

import com.ximena.discografia.model.Artist;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ArtistRepositoryImpl implements ArtistRepository {

    private List<Artist> artists = new ArrayList<>();

    @Override
    public List<Artist> findAll() {
        return artists;
    }

    @Override
    public void save(Artist artist) {
        artists.add(artist);
    }

    @Override
    public boolean exists(Artist artist) {
        //funciona con el equals del objeto
        return artists.contains(artist);
    }

    @Override
    public void deleteById(int id) {
        artists.removeIf(a -> a.getId()==(id));
    }

    @Override
    public Artist findById(int id) {
        for (Artist artist : artists) {
            if (artist.getId() == id) {
                return artist;
            }
        }
        return null;
    }

    @Override
    public Artist findByName(String name) {
        return artists.stream()
                .filter(a -> a.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}

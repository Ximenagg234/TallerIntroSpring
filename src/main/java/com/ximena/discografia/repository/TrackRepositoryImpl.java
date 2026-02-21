package com.ximena.discografia.repository;

import com.ximena.discografia.model.Track;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TrackRepositoryImpl implements TrackRepository {

    private List<Track> tracks = new ArrayList<>();

    @Override
    public List<Track> findAll() {
        return tracks;
    }

    @Override
    public void save(Track track) {
        tracks.add(track);
    }

    @Override
    public void deleteById(int id) {
        tracks.removeIf(t -> t.getId()==(id));
    }

    @Override
    public Track findById(int id) {
        return tracks.stream()
                .filter(t -> t.getId()==(id))
                .findFirst()
                .orElse(null);
    }
}
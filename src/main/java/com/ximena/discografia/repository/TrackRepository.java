package com.ximena.discografia.repository;

import com.ximena.discografia.model.Track;
import java.util.List;

public interface TrackRepository {

    List<Track> findAll();

    void save(Track track);

    void deleteById(Long id);

    Track findById(Long id);
}

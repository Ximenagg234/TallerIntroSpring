package com.ximena.discografia.service;
import com.ximena.discografia.model.Track;

import java.util.List;

public interface TrackService {

    List<Track> getAllTracks();
    void createTrack(Track track, List<Integer> artistIds);
    void deleteTrack(int id);
}

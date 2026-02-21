package com.ximena.discografia.service;

import com.ximena.discografia.model.Artist;
import com.ximena.discografia.model.Track;
import com.ximena.discografia.repository.ArtistRepository;
import com.ximena.discografia.repository.TrackRepository;

import java.util.List;

public class TrackServiceImpl implements TrackService {

    private TrackRepository trackRepository;
    private ArtistRepository artistRepository;

    public TrackServiceImpl(TrackRepository trackRepository,
                            ArtistRepository artistRepository) {
        this.trackRepository = trackRepository;
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public void createTrack(Track track, List<Integer> artistIds) {

        for (Integer id : artistIds) {

            Artist artist = artistRepository.findAll()
                    .stream()
                    .filter(a -> a.getId() == id)
                    .findFirst()
                    .orElse(null);

            if (artist != null) {
                track.getArtists().add(artist);
                artist.getTracks().add(track);
            }
        }

        trackRepository.save(track);
    }

    @Override
    public void deleteTrack(int id) {
        trackRepository.deleteById(id);
    }
}
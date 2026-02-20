package com.ximena.discografia.init;

import com.ximena.discografia.model.Artist;
import com.ximena.discografia.model.Track;
import com.ximena.discografia.repository.ArtistRepository;
import com.ximena.discografia.repository.TrackRepository;

import java.util.List;

public class DataInitializer {

    public DataInitializer(ArtistRepository artistRepository,
                           TrackRepository trackRepository) {

        for (int i = 1; i <= 10; i++) {
            Artist artist = new Artist((int) i,
                    "Artist " + i,
                    "Colombia");

            artistRepository.save(artist);
        }

        for (int i = 1; i <= 50; i++) {
            Track track = new Track((int) i,
                    "Track " + i,
                    "Pop",
                    3.5,
                    "Album " + i);

            trackRepository.save(track);
        }

        List<Artist> artists = artistRepository.findAll();
        List<Track> tracks = trackRepository.findAll();

        int index = 0;

        for (Artist artist : artists) {
            for (int j = 0; j < 5; j++) {
                Track track = tracks.get(index++);
                artist.getTracks().add(track);
                track.getArtists().add(artist);
            }
        }
    }
}
package com.ximena.discografia.init;

import com.ximena.discografia.model.Artist;
import com.ximena.discografia.model.Track;
import com.ximena.discografia.repository.ArtistRepository;
import com.ximena.discografia.repository.TrackRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(ArtistRepository artistRepository,
                           TrackRepository trackRepository) {

        String[] names = {
                "Shakira",
                "Karol G",
                "Maluma",
                "J Balvin",
                "Feid",
                "Taylor Swift",
                "Bad Bunny",
                "Dua Lipa",
                "Drake",
                "Adele"
        };

        String[] nationalities = {
                "Colombia",
                "Colombia",
                "Colombia",
                "Colombia",
                "Colombia",
                "USA",
                "Puerto Rico",
                "UK",
                "Canada",
                "UK"
        };

        for (int i = 0; i < names.length; i++) {
            Artist artist = new Artist(i + 1, names[i], nationalities[i]);
            artistRepository.save(artist);
        }

        String[] trackTitles = {
                "Hips Don't Lie",
                "Tusa",
                "Hawái",
                "Mi Gente",
                "Classy 101",
                "Blank Space",
                "Tití Me Preguntó",
                "Levitating",
                "God's Plan",
                "Rolling in the Deep",

                "Whenever, Wherever",
                "Provenza",
                "Felices los 4",
                "Ay Vamos",
                "Normal",
                "Love Story",
                "Dakiti",
                "Physical",
                "One Dance",
                "Hello",

                "Waka Waka",
                "Bichota",
                "Sobrio",
                "Safari",
                "Ferxxo 100",
                "Cardigan",
                "Yonaguni",
                "New Rules",
                "Hotline Bling",
                "Skyfall",

                "She Wolf",
                "Ocean",
                "ADMV",
                "Ritmo",
                "Chorrito Pa Las Animas",
                "Anti-Hero",
                "Moscow Mule",
                "Don't Start Now",
                "In My Feelings",
                "Someone Like You",

                "La Tortura",
                "El Makinon",
                "Corazón",
                "Ginza",
                "Hey Mor",
                "Shake It Off",
                "Callaita",
                "Dance The Night",
                "Started From The Bottom",
                "Easy On Me"
        };

        for (int i = 0; i < trackTitles.length; i++) {

            Track track = new Track(
                    i + 1,
                    trackTitles[i],
                    "Pop",
                    3.5,
                    "Greatest Hits Vol." + ((i / 10) + 1)
            );

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
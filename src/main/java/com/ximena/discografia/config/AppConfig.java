package com.ximena.discografia.config;

import com.ximena.discografia.init.DataInitializer;
import com.ximena.discografia.repository.*;
import com.ximena.discografia.service.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ArtistRepository artistRepository() {
        return new ArtistRepositoryImpl();
    }

    @Bean
    public TrackRepository trackRepository() {
        return new TrackRepositoryImpl();
    }

    @Bean
    public ArtistService artistService(ArtistRepository artistRepository) {
        return new ArtistServiceImpl(artistRepository);
    }

    @Bean
    public TrackService trackService(
            TrackRepository trackRepository,
            ArtistRepository artistRepository) {

        return new TrackServiceImpl(trackRepository, artistRepository);
    }

    @Bean
    public DataInitializer dataInitializer(
            ArtistRepository artistRepository,
            TrackRepository trackRepository) {

        return new DataInitializer(artistRepository, trackRepository);
    }
}
package com.example.cinemamongodb;

import com.example.cinemamongodb.repositories.FilmRepository;
import com.example.cinemamongodb.services.FIlmServiceImpl;
import com.example.cinemamongodb.services.FilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilmService filmService (FilmRepository filmRepository){
        return new FIlmServiceImpl(filmRepository);
    }
}

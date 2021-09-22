package com.example.cinemamongodb;

import com.example.cinemamongodb.repositories.FilmRepository;
import com.example.cinemamongodb.repositories.SeanceRepository;
import com.example.cinemamongodb.services.FIlmServiceImpl;
import com.example.cinemamongodb.services.FilmService;
import com.example.cinemamongodb.services.SeanceService;
import com.example.cinemamongodb.services.SeanceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilmService filmService (FilmRepository filmRepository){
        return new FIlmServiceImpl(filmRepository);
    }

    @Bean
    public SeanceService seanceService (SeanceRepository seanceRepository){
        return new SeanceServiceImpl(seanceRepository);
    }
}

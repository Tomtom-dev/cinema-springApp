package com.example.cinemamongodb;

import com.example.cinemamongodb.repositories.FilmRepository;
import com.example.cinemamongodb.repositories.SalleRepository;
import com.example.cinemamongodb.repositories.SeanceRepository;
import com.example.cinemamongodb.services.*;
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

//    @Bean
//    public SalleService salleService (SalleRepository salleRepository){
//        return new SalleServiceImpl(salleRepository);
//    }
}

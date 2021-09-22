package com.example.cinemamongodb.services;

import com.example.cinemamongodb.models.Film;
import com.example.cinemamongodb.models.Seance;
import com.example.cinemamongodb.repositories.SeanceRepository;

import java.util.List;

public class SeanceServiceImpl implements SeanceService {

    private SeanceRepository seanceRepository;

    public SeanceServiceImpl (SeanceRepository seanceRepository){
        this.seanceRepository= seanceRepository;
    }

    @Override
    public List<Seance> findAll(){
        return this.seanceRepository.findAll();
    }

    @Override
    public Seance save(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public List<Film> getSeance(String id) {
        return this.seanceRepository.findById(id).get().getFilms();
    }
}

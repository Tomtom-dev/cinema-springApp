package com.example.cinemamongodb.services;

import com.example.cinemamongodb.models.Salle;
import com.example.cinemamongodb.models.Seance;
import com.example.cinemamongodb.repositories.SalleRepository;

import java.util.List;


public class SalleServiceImpl implements SalleService{
    private final SalleRepository salleRepository;

    public SalleServiceImpl(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    @Override
    public List<Salle> findAll() {
        return this.salleRepository.findAll();
    }

    @Override
    public Salle save(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public List<Seance> getSalle(String id) {
        return this.salleRepository.findById(id).get().getSeances();
    }
}

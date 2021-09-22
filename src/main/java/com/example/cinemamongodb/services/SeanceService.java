package com.example.cinemamongodb.services;

import com.example.cinemamongodb.models.Film;
import com.example.cinemamongodb.models.Seance;

import java.util.List;

public interface SeanceService {

    public List<Seance> findAll();

    public Seance save (Seance seance);

    List<Film> getSeance(String id);
}

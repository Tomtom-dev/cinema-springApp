package com.example.cinemamongodb.services;

import com.example.cinemamongodb.models.Film;
import com.example.cinemamongodb.models.Salle;
import com.example.cinemamongodb.models.Seance;

import java.util.List;

public interface SalleService {
    public List<Salle> findAll();

    public Salle salle (Salle salle);

    List<Salle> getSalle(String id);

}

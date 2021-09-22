package com.example.cinemamongodb.services;
import com.example.cinemamongodb.models.Film;

import java.util.List;

public interface FilmService {
    public List<Film> findAll();
    public Film create(Film film);
    public void delete(String id);
    public Film putFilm(Film film);

    public List<Film> findByNom(String title);
}

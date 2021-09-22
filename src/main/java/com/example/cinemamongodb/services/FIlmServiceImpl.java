package com.example.cinemamongodb.services;

import com.example.cinemamongodb.models.Film;
import com.example.cinemamongodb.repositories.FilmRepository;

import java.util.List;

public class FIlmServiceImpl implements FilmService{

    private FilmRepository filmRepository;

    public FIlmServiceImpl( FilmRepository filmRepository){
        this.filmRepository= filmRepository;
    }

    @Override
    public List<Film> findAll(){
        return this.filmRepository.findAll();
    }

    @Override
    public Film create(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public void delete(String id) {
        this.filmRepository.deleteById(id);
    }

    @Override
    public Film putFilm(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public List<Film> findByTitle(String title) {
        return this.filmRepository.findByTitle(title);
    }
}

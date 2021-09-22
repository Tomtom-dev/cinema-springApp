package com.example.cinemamongodb.controllers;


import com.example.cinemamongodb.models.Film;
import com.example.cinemamongodb.services.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("film")
public class FilmController {

    private FilmService filmService;

    public FilmController (FilmService filmService){
        this.filmService= filmService;
    }

    @GetMapping
    public List<Film> findAll() {
        return this.filmService.findAll();
    }

    @PostMapping
    public Film create(@RequestBody Film film){
        return this.filmService.create(film);
    }

    @DeleteMapping("{id}")
    public void delete( @PathVariable String id){
        this.filmService.delete(id);
    }

    @PutMapping("{id}")
    public Film putFilm (@RequestParam Film film){
        return this.filmService.putFilm(film);
    }

    @GetMapping("{title}")
    public List<Film> findByTitle(@PathVariable String title){
        return this.filmService.findByTitle(title);
    }
}

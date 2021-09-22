package com.example.cinemamongodb.controllers;

import com.example.cinemamongodb.models.Film;
import com.example.cinemamongodb.models.Seance;
import com.example.cinemamongodb.services.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("seance")
public class SeanceController {

    private SeanceService seanceService;

    @Autowired
    public SeanceController (SeanceService seanceService){
        this.seanceService=seanceService;
    }

    @GetMapping
    public List<Seance> findAll() {
        return this.seanceService.findAll();
    }

    @PostMapping
    public Seance save(@RequestBody Seance seance) {
        return this.seanceService.save(seance);
    }

    @GetMapping("/{id}/film")
    public List<Film> get (@PathVariable String id){
        return this.seanceService.getSeance(id);
    }
}

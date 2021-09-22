package com.example.cinemamongodb.repositories;

import com.example.cinemamongodb.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FilmRepository extends MongoRepository <Film,String> {
//    public List<Film> findByNom(String title);
}

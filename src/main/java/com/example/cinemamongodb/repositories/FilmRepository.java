package com.example.cinemamongodb.repositories;

import com.example.cinemamongodb.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmRepository extends MongoRepository <Film,String> {
}

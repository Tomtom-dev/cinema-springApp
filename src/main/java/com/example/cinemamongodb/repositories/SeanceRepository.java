package com.example.cinemamongodb.repositories;

import com.example.cinemamongodb.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeanceRepository extends MongoRepository<Seance, String> {
}

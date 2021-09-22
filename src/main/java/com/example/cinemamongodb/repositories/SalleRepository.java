package com.example.cinemamongodb.repositories;

import com.example.cinemamongodb.models.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalleRepository extends MongoRepository <Salle, String> {
}

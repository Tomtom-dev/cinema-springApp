package com.example.cinemamongodb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Salle {

    @Id
    private String id;
    private String numéro;
    private Integer NbrPlaces;

    @DBRef
    @Field("seance")
    private List<Seance> seances= new ArrayList<>();
}

package com.example.proyecto.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Long MateriaId;
    private Long UsuarioId;

    private String texto;

    private LocalDate entryDate;

    private LocalTime entryTime;

}


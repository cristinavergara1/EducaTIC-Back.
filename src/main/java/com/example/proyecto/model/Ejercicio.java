package com.example.proyecto.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Ejercicio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long MateriaId;

    private Long Dificultad;

    private String nombre;

    private String descripcion;

    private LocalDate fechaCreacion;


}

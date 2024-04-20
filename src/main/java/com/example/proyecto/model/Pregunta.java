package com.example.proyecto.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Pregunta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Long EjercicioId;


    private String enunciado;

    private String opc1;
    private String opc2;
    private String opc3;
    private String opc4;

    private String respuestaCorrecta;
}

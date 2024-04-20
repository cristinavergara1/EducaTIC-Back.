package com.example.proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Materia {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;

      private String nombre;

      private String codigo;

      private String descripcion;

      private LocalDate entryTime;

}

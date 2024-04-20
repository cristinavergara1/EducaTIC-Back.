package com.example.proyecto.repository;


import com.example.proyecto.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepository extends JpaRepository<Pregunta,Integer> {}


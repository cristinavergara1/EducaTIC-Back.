package com.example.proyecto.repository;

import com.example.proyecto.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository <Materia,Integer>{
}
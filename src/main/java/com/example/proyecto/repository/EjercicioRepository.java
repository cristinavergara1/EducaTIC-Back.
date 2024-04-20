package com.example.proyecto.repository;

import com.example.proyecto.model.Ejercicio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EjercicioRepository extends JpaRepository <Ejercicio,Integer>{
}
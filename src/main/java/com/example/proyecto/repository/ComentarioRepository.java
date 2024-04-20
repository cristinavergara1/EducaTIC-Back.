package com.example.proyecto.repository;

import com.example.proyecto.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository <Comentario,Integer>{
}
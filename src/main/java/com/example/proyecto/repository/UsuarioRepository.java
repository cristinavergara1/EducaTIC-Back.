package com.example.proyecto.repository;

import com.example.proyecto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario,Integer>{
}
package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.curso;

import java.util.List;

@Repository
public interface cursoRepository extends JpaRepository<curso, Long> {
    List<curso> findByNombreContaining(String nombre);
    List<curso> findByCreditos(Integer creditos);
}
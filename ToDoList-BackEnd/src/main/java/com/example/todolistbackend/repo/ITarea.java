package com.example.todolistbackend.repo;

import com.example.todolistbackend.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITarea extends JpaRepository<Tarea,Integer> {

    @Query("SELECT t FROM Tarea t WHERE t.idUsuario = :usuario")
    List<Tarea> obtenerTodasLasTareasXUsuario(@Param("usuario") String usuario);
}

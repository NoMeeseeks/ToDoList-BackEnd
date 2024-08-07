package com.example.todolistbackend.repo;

import com.example.todolistbackend.model.Prioridad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPrioridad extends JpaRepository<Prioridad,Integer> {
}

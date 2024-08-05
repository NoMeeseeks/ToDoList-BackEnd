package com.example.todolistbackend.repo;

import com.example.todolistbackend.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITarea extends JpaRepository<Tarea,Integer> {

}

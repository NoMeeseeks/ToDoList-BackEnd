package com.example.todolistbackend.Repo;

import com.example.todolistbackend.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
}

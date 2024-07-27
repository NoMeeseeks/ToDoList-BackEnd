package com.example.todolistbackend.services;

import com.example.todolistbackend.Model.Usuario;

import java.util.List;

public interface IUsuarioService {

    /**
     * Obtiene todos los usuarios creados
     *
     * @return
     */
    List<Usuario> obtenerTodosLosUsuarios();
}

package com.example.todolistbackend.services;

import com.example.todolistbackend.Dto.UsuarioDTO;
import com.example.todolistbackend.Model.Usuario;

import java.util.List;

public interface IUsuarioService {

    /**
     * Obtiene todos los usuarios creados
     *
     * @return
     */
    List<Usuario> obtenerTodosLosUsuarios();

    /**
     * Obtiene el usuario por codigo
     *
     * @param idUsuario
     * @return
     */
    Usuario obtieneUsuarioXIdUsuario(Integer idUsuario);

    /**
     * metodo para actualizar alguna informacion del usuario
     *
     * @param idUsuario
     * @param usuarioDTO
     * @return
     */
    Usuario editarUsuarioXIdUsuario(Integer idUsuario,UsuarioDTO usuarioDTO);
}

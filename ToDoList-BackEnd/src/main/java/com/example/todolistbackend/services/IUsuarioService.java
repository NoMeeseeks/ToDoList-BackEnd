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
     * metodo para guardar el usuario registrado por correo
     *
     * @param idUsuario
     * @param usuarioDTO
     * @return
     */
    Usuario guardarUsuarioXIdUsuario(Integer idUsuario,UsuarioDTO usuarioDTO);

    /**
     * metodo para actualizar alguna informacion del usuario
     *
     * @param idUsuario
     * @param usuarioDTO
     * @return
     */
    Usuario editarUsuarioXIdUsuario(Integer idUsuario,UsuarioDTO usuarioDTO);

    /**
     * Elimina el usuario de manera permanente
     *
     * @param idUsuario
     * @return
     */
    void eliminarUsuarioXIdUsuario(Integer idUsuario);

}

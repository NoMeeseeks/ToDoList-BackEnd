package com.example.todolistbackend.services;

import com.example.todolistbackend.dto.TareaDTO;

import java.util.List;

public interface ITareaService {

    /**
     * Lista todas las tareas creadas por el usuairo
     *
     * @param idUsuario
     * @return
     */
    List<TareaDTO> obtenerTodasLasTareas(Integer idUsuario);
}

package com.example.todolistbackend.services;


import com.example.todolistbackend.model.Prioridad;

import java.util.List;

public interface IPrioridadService {

    /**
     * obtiene todas las prioridades
     *
     * @return
     */
    public List<Prioridad> obtenerTodasLasPrioridades();
}

package com.example.todolistbackend.services.impl;

import com.example.todolistbackend.model.Prioridad;
import com.example.todolistbackend.repo.IPrioridad;
import com.example.todolistbackend.services.IPrioridadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrioridadService implements IPrioridadService {

    private final IPrioridad iPrioridadRepo;

    public List<Prioridad> obtenerTodasLasPrioridades(){
        return iPrioridadRepo.findAll();
    }
}

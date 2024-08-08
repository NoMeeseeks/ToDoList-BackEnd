package com.example.todolistbackend.services.impl;

import com.example.todolistbackend.dto.TareaDTO;
import com.example.todolistbackend.services.ITareaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TareaService implements ITareaService {


    @Override
    public List<TareaDTO> obtenerTodasLasTareas(Integer idUsuario) {
        return List.of();
    }
}

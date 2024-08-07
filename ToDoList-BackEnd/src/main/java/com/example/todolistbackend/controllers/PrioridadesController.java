package com.example.todolistbackend.controllers;

import com.example.todolistbackend.converter.PrioridadDtoConverter;
import com.example.todolistbackend.dto.PrioridadDTO;
import com.example.todolistbackend.model.Prioridad;
import com.example.todolistbackend.repo.IPrioridad;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/prioridades")
@RequiredArgsConstructor
public class PrioridadesController {

    private final IPrioridad iPrioridadService;
    private final PrioridadDtoConverter prioridadDtoConverter;

    @GetMapping()
    public ResponseEntity<?> obtenerTodasLasPrioridades(){
        List<PrioridadDTO> lsDto = new ArrayList<>();
        List<Prioridad> lsModel = new ArrayList<>();

        for (Prioridad model: lsModel){
            lsDto.add(prioridadDtoConverter.converterPrioridadModelToDto(model));
        }
        return ResponseEntity.ok(lsDto);
    }
}

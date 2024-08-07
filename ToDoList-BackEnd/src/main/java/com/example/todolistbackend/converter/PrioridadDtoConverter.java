package com.example.todolistbackend.converter;

import com.example.todolistbackend.dto.PrioridadDTO;
import com.example.todolistbackend.model.Prioridad;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrioridadDtoConverter {

    @Qualifier("defaultMapper")
    private final ModelMapper modelMapper;

    public PrioridadDTO converterPrioridadModelToDto(Prioridad model){
        return  modelMapper.map(model,PrioridadDTO.class);
    }
}

package com.example.todolistbackend.converter;

import com.example.todolistbackend.dto.UsuarioDTO;
import com.example.todolistbackend.model.Usuario;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioDtoConverter {

    @Qualifier("defaultMapper")
    private final ModelMapper modelMapper;

    public UsuarioDTO converterUsuarioModelToDto(Usuario model) {
        return modelMapper.map(model, UsuarioDTO.class);
    }

}

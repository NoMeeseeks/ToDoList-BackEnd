package com.example.todolistbackend.services.impl;

import com.example.todolistbackend.Model.Usuario;
import com.example.todolistbackend.Repo.IUsuarioRepo;
import com.example.todolistbackend.services.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService implements IUsuarioService {

    private final IUsuarioRepo iUsuarioRepo;

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return iUsuarioRepo.findAll();
    }
}

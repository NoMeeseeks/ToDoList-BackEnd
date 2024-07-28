package com.example.todolistbackend.services.impl;

import com.example.todolistbackend.Model.Usuario;
import com.example.todolistbackend.Repo.IUsuarioRepo;
import com.example.todolistbackend.services.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService implements IUsuarioService {

    private final IUsuarioRepo iUsuarioRepo;

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return iUsuarioRepo.findAll();
    }

    @Override
    public Usuario obtieneUsuarioXIdUsuario(Integer idUsuario) {

        Optional<Usuario> usuarioModel = iUsuarioRepo.obtieneUsuarioXIdUsuario(idUsuario);

        if (usuarioModel.isPresent()){
            return usuarioModel.get();
        }

        return null;
    }
}

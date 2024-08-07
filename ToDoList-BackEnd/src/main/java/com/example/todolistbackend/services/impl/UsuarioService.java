package com.example.todolistbackend.services.impl;

import com.example.todolistbackend.dto.UsuarioDTO;
import com.example.todolistbackend.model.Usuario;
import com.example.todolistbackend.repo.IUsuarioRepo;
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

        if (usuarioModel.isPresent()) {
            return usuarioModel.get();
        }else {
            throw new RuntimeException("No se encontro el usuario");
        }
    }

    @Override
    public Usuario guardarUsuarioXIdUsuario(UsuarioDTO usuarioDTO) {
        Optional<Usuario> usuarioRegistrado = iUsuarioRepo.obtieneUsuarioXCorreo(usuarioDTO.getCorreo().toLowerCase());

        if (usuarioRegistrado.isPresent()) {
            throw new RuntimeException("El correo ya se encuentra asginado");
        }

        Usuario usuarioModel = new Usuario();
        usuarioModel.setNombre(usuarioDTO.getNombre());
        usuarioModel.setApellido(usuarioDTO.getApellido());
        usuarioModel.setCorreo(usuarioDTO.getCorreo());
        usuarioModel.setContrasena(usuarioDTO.getContrasena());
        usuarioModel.setEsActivo("S");
        iUsuarioRepo.save(usuarioModel);

        return usuarioModel;
    }


    @Override
    public Usuario editarUsuarioXIdUsuario(Integer idUsuario, UsuarioDTO usuarioDTO) {

        Usuario usuarioModel = this.obtieneUsuarioXIdUsuario(idUsuario);
        if (usuarioModel != null) {
            usuarioModel.setNombre(usuarioDTO.getNombre());
            usuarioModel.setApellido(usuarioDTO.getApellido());
            usuarioModel.setCorreo(usuarioDTO.getCorreo());
            iUsuarioRepo.save(usuarioModel);
        }
        return usuarioModel;
    }

    @Override
    public void eliminarUsuarioXIdUsuario(Integer idUsuario) {
        Usuario usuarioModel = this.obtieneUsuarioXIdUsuario(idUsuario);
        if (usuarioModel != null) {
            usuarioModel.setEsActivo("N");
            iUsuarioRepo.save(usuarioModel);
        }
    }

}

package com.example.todolistbackend.services.impl;

import com.example.todolistbackend.Dto.UsuarioDTO;
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

        if (usuarioModel.isPresent()) {
            return usuarioModel.get();
        }

        return null;
    }

    @Override
    public Usuario guardarUsuarioXIdUsuario(UsuarioDTO usuarioDTO) {

        Usuario usuarioModel = new Usuario();
        usuarioModel.setNombre(usuarioDTO.getNombre());
        usuarioModel.setApellido(usuarioDTO.getApellido());
        usuarioModel.setCorreo(usuarioDTO.getCorreo());
        usuarioModel.setEsActivo("S");
        iUsuarioRepo.save(usuarioModel);

        return null;
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

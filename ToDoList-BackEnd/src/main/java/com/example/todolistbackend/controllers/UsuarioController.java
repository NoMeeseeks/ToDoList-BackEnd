package com.example.todolistbackend.controllers;

import com.example.todolistbackend.Model.Usuario;
import com.example.todolistbackend.Repo.IUsuarioRepo;
import com.example.todolistbackend.services.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final IUsuarioService iUsuarioService;

    @GetMapping()
    public ResponseEntity<?> obtenerTodosLosUsuario(){

        List<Usuario> ls = iUsuarioService.obtenerTodosLosUsuarios();

        for (Usuario item: ls){
            System.out.println(item.getIdUsuario());
            System.out.println(item.getNombre());
            System.out.println(item.getApellido());
        }

        return ResponseEntity.ok().build();
    }
}

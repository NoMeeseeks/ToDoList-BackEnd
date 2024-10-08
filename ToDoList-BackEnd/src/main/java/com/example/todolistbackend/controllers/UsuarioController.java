package com.example.todolistbackend.controllers;

import com.example.todolistbackend.converter.UsuarioDtoConverter;
import com.example.todolistbackend.dto.UsuarioDTO;
import com.example.todolistbackend.model.Usuario;
import com.example.todolistbackend.services.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final IUsuarioService iUsuarioService;
    private final UsuarioDtoConverter usuarioDtoConverter;

    @GetMapping("/obtenerTodos")
    public ResponseEntity<?> obtenerTodosLosUsuario() {

        List<Usuario> ls = iUsuarioService.obtenerTodosLosUsuarios();

        for (Usuario item : ls) {
            System.out.println(item.getIdUsuario());
            System.out.println(item.getNombre());
            System.out.println(item.getApellido());
        }

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{codigoUsuario}")
    public ResponseEntity<?> obtenerUsuario(
            @PathVariable(name = "codigoUsuario") Integer codigoUsuario
    ) {
        Usuario modelUsuario = iUsuarioService.obtieneUsuarioXIdUsuario(codigoUsuario);

        return ResponseEntity.ok(usuarioDtoConverter.converterUsuarioModelToDto(modelUsuario));
    }

    @PostMapping()
    public ResponseEntity<?> saveUsuario(
            @RequestBody UsuarioDTO usuarioDTO
    ) {
        Usuario modelUsuario = iUsuarioService.guardarUsuarioXIdUsuario(usuarioDTO);

        return ResponseEntity.ok(usuarioDtoConverter.converterUsuarioModelToDto(modelUsuario));

    }

    @PutMapping("/{codigoUsuario}")
    public ResponseEntity<?> actualizarUsuario(
            @PathVariable(name = "codigoUsuario") Integer codigoUsuario,
            @RequestBody UsuarioDTO usuarioDTO) {

        Usuario modelUsuario = iUsuarioService.editarUsuarioXIdUsuario(codigoUsuario, usuarioDTO);

        return ResponseEntity.ok(usuarioDtoConverter.converterUsuarioModelToDto(modelUsuario));
    }

    @DeleteMapping("/{codigoUsuario}/inactivar")
    public ResponseEntity<?> eliminarUsuario(@PathVariable(name = "codigoUsuario") Integer codigoUsuario) {

        iUsuarioService.eliminarUsuarioXIdUsuario(codigoUsuario);

        return ResponseEntity.ok().build();
    }
}

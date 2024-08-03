package com.example.todolistbackend.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private Integer idUsuario;

    private String nombre;

    private String apellido;

    private String nombreCompleto;

    @NonNull
    private String correo;

    @NonNull
    private String contrasena;
}

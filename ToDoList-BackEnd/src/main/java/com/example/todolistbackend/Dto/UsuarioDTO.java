package com.example.todolistbackend.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

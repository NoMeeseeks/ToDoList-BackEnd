package com.example.todolistbackend.services.impl;

import com.example.todolistbackend.services.IPruebaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PruebaService implements IPruebaService {

    public String obtenerSaludo(String nombre, String apellido) {

        String saludo = nombre + " " + apellido + " " + "Bienvenido a tu lista de tareas";

        return saludo;
    }
}

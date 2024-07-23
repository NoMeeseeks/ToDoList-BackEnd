package com.example.todolistbackend.controllers;

import com.example.todolistbackend.services.IPruebaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pruebas")
@RequiredArgsConstructor
public class PruebaController {

    private final IPruebaService pruebaService;

    @GetMapping("/prueba")
    public String obtenerHola(){

        String nombre = "Xavier";
        String apellido = "Santamaria";

        return pruebaService.obtenerSaludo(nombre,apellido);
    }

}

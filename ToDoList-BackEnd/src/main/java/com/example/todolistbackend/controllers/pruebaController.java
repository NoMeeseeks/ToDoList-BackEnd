package com.example.todolistbackend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaController {

    @GetMapping("/prueba")
    public String obtenerHola(){

        return "Xavier hola bienvenido a esta prueba";
    }

}

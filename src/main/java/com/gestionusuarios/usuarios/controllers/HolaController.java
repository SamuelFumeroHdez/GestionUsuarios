package com.gestionusuarios.usuarios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HolaController {

    @GetMapping
    public String inicio(){
        return "ESTÁ FUNCIONANDO!";
    }
}

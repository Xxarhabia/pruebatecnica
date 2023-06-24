package com.wposs.pueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @GetMapping("/")
    public String inicio(){
        return "index";
    }

    @PostMapping("/agregar")
    public String agregar(){
        return "register";
    }
}

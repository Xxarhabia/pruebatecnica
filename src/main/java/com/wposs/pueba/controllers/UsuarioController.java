package com.wposs.pueba.controllers;

import com.wposs.pueba.entities.UsuarioEntity;
import com.wposs.pueba.services.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @GetMapping("/")
    public String inicio(){
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(){
        return "register";
    }

    @PostMapping("/guardar")
    public String guardar(UsuarioEntity usuario){
        usuarioService.agregarUsuario(usuario);
        return "redirect:/";
    }

}

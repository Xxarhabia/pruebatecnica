package com.wposs.pueba.services;

import com.wposs.pueba.entities.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    List<UsuarioEntity> listarUsuario();

    void agregarUsuario(UsuarioEntity usuario);

    UsuarioEntity buscarUsuario(UsuarioEntity usuario);
}

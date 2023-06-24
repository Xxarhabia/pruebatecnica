package com.wposs.pueba.services.impl;

import com.wposs.pueba.entities.UsuarioEntity;
import com.wposs.pueba.repository.UsuarioRepository;
import com.wposs.pueba.services.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioEntity> listarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public void agregarUsuario(UsuarioEntity usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public UsuarioEntity buscarUsuario(UsuarioEntity usuario) {
        return usuarioRepository.findById(usuario.getIdUsuario()).orElse(null);
    }
}

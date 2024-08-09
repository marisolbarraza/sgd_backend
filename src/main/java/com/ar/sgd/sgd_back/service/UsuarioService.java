package com.ar.sgd.sgd_back.service;

import com.ar.sgd.sgd_back.model.Usuario;
import com.ar.sgd.sgd_back.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    IUsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void eliminarUsuario(long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario buscarUsuario(long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void editarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

}

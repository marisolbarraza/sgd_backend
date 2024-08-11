package com.ar.sgd.sgd_back.controller;

import com.ar.sgd.sgd_back.auth.AuthResponse;
import com.ar.sgd.sgd_back.auth.AuthService;
import com.ar.sgd.sgd_back.auth.RegisterRequest;
import com.ar.sgd.sgd_back.model.Usuario;
import com.ar.sgd.sgd_back.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private final AuthService authService;


    @GetMapping("/usuario")
    @ResponseBody
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

//    @PostMapping("/usuario")
//    @ResponseBody
//    public Usuario crearUsuario(@RequestBody Usuario usuario) {
//        return usuarioService.crearUsuario(usuario);
//    }

    @DeleteMapping("/usuario/{id}")
    public void eliminarUsuario(@PathVariable int id) {
        usuarioService.eliminarUsuario(id);
    }

    @GetMapping("/usuario/{id}")
    @ResponseBody
    public Usuario buscarUsuario(@PathVariable int id) {
        return usuarioService.buscarUsuario(id);
    }

    @PutMapping("/usuario")
    public void editarUsuario(@RequestBody Usuario usuario) {
        usuarioService.editarUsuario(usuario);
    }

    @PostMapping(value="register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }




}

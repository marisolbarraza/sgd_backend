package com.ar.sgd.sgd_back.auth;

import com.ar.sgd.sgd_back.jwt.JwtAuthenticationFilter;
import com.ar.sgd.sgd_back.jwt.JwtService;
import com.ar.sgd.sgd_back.model.Usuario;
import com.ar.sgd.sgd_back.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final IUsuarioRepository usuarioRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword()));
        UserDetails usuario = usuarioRepository.findByEmail(request.getEmail()).orElseThrow();
        String token = jwtService.getToken(usuario);
        return  AuthResponse.builder().token(token).build();
    }

    public AuthResponse register(RegisterRequest request) {
        Usuario usuario = new Usuario();
        usuario.setDni(request.getDni());
        usuario.setNombre(request.getNombre());
        usuario.setApellido(request.getApellido());
        usuario.setEmail(request.getEmail());
        usuario.setTelefono(request.getTelefono());
        usuario.setPuesto(request.getPuesto());
        usuario.setContrasenia(passwordEncoder.encode(request.getContrasenia()));
        usuario.setRol(request.getRol());

        usuarioRepository.save(usuario);
        return AuthResponse.builder().token(jwtService.getToken(usuario)).build();

    }
}

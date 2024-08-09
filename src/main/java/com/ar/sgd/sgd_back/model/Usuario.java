package com.ar.sgd.sgd_back.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name="Usuario")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Usuario implements UserDetails {
    @Id private long dni;
    @Column(nullable = false) @NonNull
    private String nombre;
    @Column(nullable = false) @NonNull
    private String apellido;
    @Column(nullable = false, unique = true) @NonNull
    private String email;
    @Column(nullable = false) @NonNull
    private String telefono;
    @Column(nullable = false) @NonNull
    private String contrasenia;
    @Column(nullable = false)@NonNull
    private String puesto;
    @ManyToOne @JoinColumn(name = "idRol", nullable = false) @NonNull
    private Rol rol;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(rol.getDescripcion()));
    }

    @Override
    public String getPassword() {
        return getContrasenia();
    }

    @Override
    public String getUsername() {
        return getEmail();
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}

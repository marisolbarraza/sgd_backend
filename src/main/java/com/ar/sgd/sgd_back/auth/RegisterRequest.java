package com.ar.sgd.sgd_back.auth;

import com.ar.sgd.sgd_back.model.Rol;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    long dni;
    String nombre;
    String apellido;
    String email;
    String telefono;
    String contrasenia;
    String puesto;
    Rol rol;

}

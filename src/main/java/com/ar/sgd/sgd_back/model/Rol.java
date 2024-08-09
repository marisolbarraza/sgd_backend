package com.ar.sgd.sgd_back.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table (name = "Rol")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Rol {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idRol;
    @Column(nullable = false) @NonNull
    private String descripcion;



}

package com.ar.sgd.sgd_back.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Entity
@Table (name = "Log")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLog;
    @Column(nullable = false) @NonNull
    private String descripcion;
    @Column(nullable = false) @NonNull
    private LocalDate fechaAccion;
    @Enumerated(EnumType.STRING) @Column(nullable = false) @NonNull
    private Accion accion;
    @ManyToOne @JoinColumn(name = "dni", nullable = false) @NonNull
    private Usuario usuario;

}

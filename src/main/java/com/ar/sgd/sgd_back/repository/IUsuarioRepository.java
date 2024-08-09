package com.ar.sgd.sgd_back.repository;

import com.ar.sgd.sgd_back.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {

    // Usuario findByEmailAndContrasenia(String email, String password);

    Optional<Usuario> findByEmail(String email);
}

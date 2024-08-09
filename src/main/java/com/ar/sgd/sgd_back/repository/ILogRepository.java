package com.ar.sgd.sgd_back.repository;

import com.ar.sgd.sgd_back.model.Accion;
import com.ar.sgd.sgd_back.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILogRepository extends JpaRepository<Log,Long> {
    List<Log> findByUsuarioDni(long dni);
    List<Log> findByAccion(Accion accion);

}

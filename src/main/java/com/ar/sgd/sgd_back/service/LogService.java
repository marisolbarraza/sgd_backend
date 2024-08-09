package com.ar.sgd.sgd_back.service;

import com.ar.sgd.sgd_back.model.Accion;
import com.ar.sgd.sgd_back.model.Log;
import com.ar.sgd.sgd_back.repository.ILogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogService {
    @Autowired
    private final ILogRepository logRepository;


    public List<Log> listarLogs(){
        return logRepository.findAll();
    }

    public Log crearLog(Log log){
        return logRepository.save(log);
    }

    public List<Log> buscarLogsPorUsuario(long dni){

        return logRepository.findByUsuarioDni(dni);
    }

    public List<Log> buscarLogsPorAccion(Accion accion){
        return logRepository.findByAccion(accion);
    }




}

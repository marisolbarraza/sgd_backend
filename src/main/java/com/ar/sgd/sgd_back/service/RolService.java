package com.ar.sgd.sgd_back.service;

import com.ar.sgd.sgd_back.model.Rol;
import com.ar.sgd.sgd_back.repository.IRolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RolService {
    @Autowired
    private final IRolRepository rolRepository;

    public List<Rol> obtenerRoles(){
        return rolRepository.findAll();
    }

}

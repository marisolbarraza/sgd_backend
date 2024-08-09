package com.ar.sgd.sgd_back.controller;

import com.ar.sgd.sgd_back.model.Rol;
import com.ar.sgd.sgd_back.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RolController {
    @Autowired
    private final RolService rolService;

    @GetMapping("/Rol")
    @ResponseBody
    public List<Rol> obtenerRoles(){
        return rolService.obtenerRoles();
    }
}

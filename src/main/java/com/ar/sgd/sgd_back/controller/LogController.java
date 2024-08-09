package com.ar.sgd.sgd_back.controller;

import com.ar.sgd.sgd_back.model.Accion;
import com.ar.sgd.sgd_back.model.Log;
import com.ar.sgd.sgd_back.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/auditoria")
    @ResponseBody
    public List<Log> listarLogs() {
        return logService.listarLogs();
    }
    @GetMapping("auditoria/{dni}")
    @ResponseBody
    public List<Log> buscarLog(@PathVariable long dni) {
        return logService.buscarLogsPorUsuario(dni);
    }
    @PostMapping("/auditoria")
    @ResponseBody
    public void crearLog(@RequestBody Log log) {
        logService.crearLog(log);
    }

    @GetMapping("/auditoria/{accion}")
    @ResponseBody
    public List<Log> buscarLogPorAccion(@PathVariable Accion accion) {
        return logService.buscarLogsPorAccion(accion);
    }
}

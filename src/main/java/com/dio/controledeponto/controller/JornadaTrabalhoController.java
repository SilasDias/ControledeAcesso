package com.dio.controledeponto.controller;

import com.dio.controledeponto.model.JornadaTrabalho;
import com.dio.controledeponto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    private final JornadaService jornadaService;

    @Autowired
    public JornadaTrabalhoController(JornadaService jornadaService) {
        this.jornadaService = jornadaService;
    }

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    public List<JornadaTrabalho> listAll(){
        return jornadaService.listAll();
    }

    @GetMapping("/{id}")
    public JornadaTrabalho findById(@PathVariable Long id) {
        return jornadaService.findById(id);
    }


}

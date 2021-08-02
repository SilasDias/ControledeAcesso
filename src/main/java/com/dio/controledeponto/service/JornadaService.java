package com.dio.controledeponto.service;

import com.dio.controledeponto.model.JornadaTrabalho;
import com.dio.controledeponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired // Initialize
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }
}

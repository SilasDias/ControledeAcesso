package com.dio.controledeponto.service;

import com.dio.controledeponto.model.JornadaTrabalho;
import com.dio.controledeponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    private JornadaRepository jornadaRepository;

    @Autowired // Initialize
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> listAll() {
        List<JornadaTrabalho> allJornadaTrabalhos = jornadaRepository.findAll();
        return allJornadaTrabalhos;
    }

    public JornadaTrabalho findById(@PathVariable Long id) {
        Optional<JornadaTrabalho> optionalJornada = jornadaRepository.findById(id);
        return optionalJornada.get();
    }

    public JornadaTrabalho updateById(Long id, JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(Long id){
        jornadaRepository.deleteById(id);
    }
}

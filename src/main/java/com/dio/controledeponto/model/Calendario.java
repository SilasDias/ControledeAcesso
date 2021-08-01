package com.dio.controledeponto.model;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

public class Calendario {

    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}

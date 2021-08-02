package com.dio.controledeponto.model;

import lombok.*;

import javax.persistence.ManyToOne;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Localidade {

    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}

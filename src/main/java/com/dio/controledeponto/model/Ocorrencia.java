package com.dio.controledeponto.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Ocorrencia {

    private Long id;
    private String nome;
    private String descricao;
}

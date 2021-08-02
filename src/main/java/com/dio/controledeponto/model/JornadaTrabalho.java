package com.dio.controledeponto.model;

import lombok.*;

import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class JornadaTrabalho {

    @Id
    private Long id;
    private String descricao;

}

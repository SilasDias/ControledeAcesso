package com.dio.controledeponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Ocorrencia {

    @Id
    private Long id;
    private String nome;
    private String descricao;
}

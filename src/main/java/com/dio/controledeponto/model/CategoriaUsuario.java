package com.dio.controledeponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CategoriaUsuario {

    @Id
    private Long id;
    private String descricao;
}

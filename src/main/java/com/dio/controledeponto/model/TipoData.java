package com.dio.controledeponto.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TipoData {

    private Long id;
    private String descricao;

}

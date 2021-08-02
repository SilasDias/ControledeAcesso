package com.dio.controledeponto.model;

import lombok.*;

import javax.persistence.OneToMany;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class NivelAcesso {

    private Long id;
    @OneToMany
    private NivelAcesso nivelAcesso;
    private String descricao;
}

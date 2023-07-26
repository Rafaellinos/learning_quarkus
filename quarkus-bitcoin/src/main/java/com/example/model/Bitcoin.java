package com.example.model;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.time.LocalDate;

@RegisterForReflection
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Bitcoin {

    private Integer id;
    private Double preco;
    private String tipo;
    private LocalDate data;

}

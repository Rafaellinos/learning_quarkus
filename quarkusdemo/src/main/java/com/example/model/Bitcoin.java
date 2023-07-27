package com.example.model;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.time.LocalDate;

@Data
@RegisterForReflection
public class Bitcoin {

    private Long id;

    private Double preco;

    private String tipo;

    private LocalDate data;

}

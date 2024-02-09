package com.eacuamba.dev;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Produto {
    private String     nome;
    private BigDecimal valorTotal;
}

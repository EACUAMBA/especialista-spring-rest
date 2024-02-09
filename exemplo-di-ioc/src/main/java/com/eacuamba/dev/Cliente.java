package com.eacuamba.dev;

import lombok.Getter;

@Getter
public class Cliente {
    private String  nome;
    private String  email;
    private String  telefone;
    private boolean activo = false;

    public Cliente(String nome, String email, String telefone)
    {
        this.nome     = nome;
        this.email    = email;
        this.telefone = telefone;
    }

    public void activar()
    {
        this.activo = true;
    }
}

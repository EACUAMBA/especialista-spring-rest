package com.eacuamba.service;

import com.eacuamba.dev.Cliente;
import com.eacuamba.notificacao.Notificador;

public class ActivacaoClienteService {
    private Notificador notificador;

    public ActivacaoClienteService(Notificador notificador)
    {
        this.notificador = notificador;
    }

    public void activar(Cliente cliente)
    {
        cliente.activar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema está activo!");
    }
}

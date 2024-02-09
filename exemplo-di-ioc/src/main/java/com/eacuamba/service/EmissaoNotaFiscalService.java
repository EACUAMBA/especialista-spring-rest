package com.eacuamba.service;

import com.eacuamba.dev.Cliente;
import com.eacuamba.dev.Produto;
import com.eacuamba.notificacao.Notificador;

public class EmissaoNotaFiscalService {
    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador)
    {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto)
    {

        this.notificador.notificar(cliente, "Nota fiscal para o producto " + produto.getNome());
    }
}

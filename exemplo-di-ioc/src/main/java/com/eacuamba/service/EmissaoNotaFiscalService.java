package com.eacuamba.service;

import com.eacuamba.dev.Cliente;
import com.eacuamba.dev.Produto;
import com.eacuamba.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {
    public void emitir(Cliente cliente, Produto produto){

        NotificadorEmail notificadorEmail = new NotificadorEmail();
        notificadorEmail.notificar(cliente, "Nota fiscal para o producto " + produto.getNome());
    }
}

package com.eacuamba.notificacao;

import com.eacuamba.dev.Cliente;

public interface Notificador {
    public void notificar(Cliente cliente, String mensagem);
}

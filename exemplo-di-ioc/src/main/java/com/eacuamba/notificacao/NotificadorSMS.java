package com.eacuamba.notificacao;

import com.eacuamba.dev.Cliente;

public class NotificadorSMS implements Notificador {
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificanto %s atravez de SMS numero %s: %s\n",
                          cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}

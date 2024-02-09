package com.eacuamba.notificacao;

import com.eacuamba.dev.Cliente;

public class NotificadorEmail implements Notificador {
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificanto %s atravez do email %s: %s\n",
                          cliente.getNome(), cliente.getEmail(), mensagem);
    }
}

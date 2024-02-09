package com.eacuamba.service;

import com.eacuamba.dev.Cliente;
import com.eacuamba.notificacao.NotificadorEmail;

public class ActivacaoClienteService {

    public void activar(Cliente cliente){
        cliente.activar();

        NotificadorEmail notificadorEmail = new NotificadorEmail();
        notificadorEmail.notificar(cliente, "Seu cadastro no sistema está activo!");
    }
}

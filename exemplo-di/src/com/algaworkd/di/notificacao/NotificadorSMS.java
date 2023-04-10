package com.algaworkd.di.notificacao;

import com.algaworkd.di.modelo.Cliente;

public class NotificadorSMS implements Notificador{
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através de SMS do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}

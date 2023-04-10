package com.algaworkd.di.notificacao;

import com.algaworkd.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}

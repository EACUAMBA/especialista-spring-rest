package com.algaworkd.di;

import com.algaworkd.di.modelo.Cliente;
import com.algaworkd.di.notificacao.Notificador;
import com.algaworkd.di.notificacao.NotificadorEmail;
import com.algaworkd.di.notificacao.NotificadorSMS;
import com.algaworkd.di.service.ActivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao", "joao@gmail.com", "123123123");
		Cliente maria = new Cliente("Maria", "maria@gmail.com", "123123123");
		
		Notificador notificador = new NotificadorSMS();
		
		ActivacaoClienteService activacaoClienteService = new ActivacaoClienteService(notificador);
		
		activacaoClienteService.activar(joao);
		activacaoClienteService.activar(maria);
	}

}

package com.algaworkd.di.service;

import com.algaworkd.di.modelo.Cliente;
import com.algaworkd.di.notificacao.Notificador;

public class ActivacaoClienteService {
	
	private Notificador notificador;
	
	public ActivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void activar(Cliente cliente) {
		cliente.activar();
		this.notificador.notificar(cliente, "Seu cadastro está activo!");
	}
}

package com.algaworkd.di.service;

import com.algaworkd.di.modelo.Cliente;
import com.algaworkd.di.modelo.Produto;
import com.algaworkd.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {
	
private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produtor) {
		// TODO: emitir nota fiscal
		
		notificador.notificar(cliente, "Nota fiscal do produto " + produtor.getNome() + " foi emitida");
	}

}

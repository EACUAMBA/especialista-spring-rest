package com.algaworkd.di.notificacao;

import com.algaworkd.di.modelo.Cliente;

public interface Notificador {
	void notificar(Cliente cliente, String mensagem);
}

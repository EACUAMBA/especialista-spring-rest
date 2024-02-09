package com.eacuamba;

import com.eacuamba.dev.Cliente;
import com.eacuamba.service.ActivacaoClienteService;

public class ApplicationMain {
    public static void main(String[] args)
    {
        Cliente maria = new Cliente("Maria", "maria@eacuamba.com", "123456789");
        Cliente ana = new Cliente("Ana", "ana@eacuamba.com", "123456789");

        ActivacaoClienteService activacaoClienteService = new ActivacaoClienteService();
        activacaoClienteService.activar(maria);
        activacaoClienteService.activar(ana);
    }
}

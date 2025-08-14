package org.github.juniottemp.domain.services;

import org.github.juniottemp.config.exceptions.TipoChaveNaoEncontradaException;
import org.github.juniottemp.domain.model.Client;

public class ClientServices implements IClientService{

    private IClienteDAO clienteDAO;

    public ClientServices(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean save(Client client) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(client);
    }

    @Override
    public Client findByCpf(Long cpf) {
        return clienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void atualizar(Client client) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(client);
    }
}

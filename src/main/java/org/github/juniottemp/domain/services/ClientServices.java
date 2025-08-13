package org.github.juniottemp.domain.services;

import org.github.juniottemp.domain.model.Client;

public class ClientServices implements IClientService{

    private IClienteDAO clienteDAO;

    public ClientServices(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean save(Client client) {
        return clienteDAO.save(client);
    }

    @Override
    public Client findByCpf(String cpf) {
        return clienteDAO.getByCpf(cpf);
    }

    @Override
    public void excluir(String cpf) {
        clienteDAO.delete(cpf);
    }

    @Override
    public void atualizar(Client client) {
        clienteDAO.update(client);
    }
}

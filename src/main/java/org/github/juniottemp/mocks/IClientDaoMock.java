package org.github.juniottemp.mocks;

import org.github.juniottemp.config.exceptions.TipoChaveNaoEncontradaException;
import org.github.juniottemp.domain.model.Client;
import org.github.juniottemp.domain.services.IClienteDAO;

import java.util.Collection;
import java.util.List;

public class IClientDaoMock implements IClienteDAO {

    @Override
    public Boolean cadastrar(Client entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Client entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Client consultar(Long valor) {
        Client client = new Client();
        client.setCpf(valor);
        return null;
    }

    @Override
    public Collection<Client> buscarTodos() {
        return List.of();
    }
}

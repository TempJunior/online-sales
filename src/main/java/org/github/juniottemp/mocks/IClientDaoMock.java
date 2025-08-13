package org.github.juniottemp.mocks;

import org.github.juniottemp.domain.model.Client;
import org.github.juniottemp.domain.services.IClienteDAO;

import java.util.List;

public class IClientDaoMock implements IClienteDAO {
    @Override
    public Client getByCpf(String cpf) {
        Client client = new Client();
        client.setCpf(cpf);
        return client;
    }

    @Override
    public List<Client> getAll() {
        return List.of();
    }

    @Override
    public Boolean save(Client client) {
        return true;
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(String cpf) {

    }
}

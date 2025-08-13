package org.github.juniottemp.domain.services;

import org.github.juniottemp.domain.model.Client;

import java.util.List;

public class ClienteDAO_mysql implements IClienteDAO {

    @Override
    public Client getByCpf(String cpf) {
        return null;
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

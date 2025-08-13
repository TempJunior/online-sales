package org.github.juniottemp.domain.services;

import org.github.juniottemp.domain.model.Client;

import java.util.List;

public interface IClienteDAO {
    Client getByCpf(String cpf);
    List<Client> getAll();
    Boolean save(Client client);
    void update(Client client);
    void delete(String cpf);
}

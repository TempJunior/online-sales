package org.github.juniottemp.domain.services;

import org.github.juniottemp.domain.model.Client;

public interface IClientService {
    Boolean save(Client client);

    Client findByCpf(String cpf);

    void excluir(String cpf);

    void atualizar(Client client);
}

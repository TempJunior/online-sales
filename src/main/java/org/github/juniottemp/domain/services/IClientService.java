package org.github.juniottemp.domain.services;

import org.github.juniottemp.config.exceptions.TipoChaveNaoEncontradaException;
import org.github.juniottemp.domain.model.Client;

public interface IClientService {
    Boolean save(Client client) throws TipoChaveNaoEncontradaException;

    Client findByCpf(Long cpf);

    void excluir(Long cpf);

    void atualizar(Client client) throws TipoChaveNaoEncontradaException;
}

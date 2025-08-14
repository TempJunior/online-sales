package org.github.juniottemp.domain.services;

import org.github.juniottemp.domain.generics.GenericDAO;
import org.github.juniottemp.domain.model.Client;

import java.util.List;

public class ClienteDAO_mysql extends GenericDAO<Client> implements IClienteDAO {

    @Override
    public Class<Client> getTipoClasse() {
        return Client.class;
    }

    @Override
    public void atualiarDados(Client entity, Client entityCadastrado) {

    }
}

package org.github.juniottemp.domain.model;

import org.github.juniottemp.domain.services.IClienteDAO;
import org.github.juniottemp.mocks.IClientDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientDaoTest {

    private IClienteDAO clienteDAO;

    private Client client;

    public ClientDaoTest(){
        clienteDAO = new IClientDaoMock();
    }

    @Before
    public void init(){
        client = new Client();
        client.setNome("Joselito Junior");
        client.setCpf("24111758843");
        client.setBanco(Banco.ITAU);
        client.setCidade(Cidade.SAO_PAULO);

        clienteDAO.save(client);
    }

    @Test
    public void pesquisarCliente(){

        Client consultingClient = clienteDAO.getByCpf(client.getCpf());

        Assert.assertNotNull(client);
        Assert.assertEquals(client.getCpf(), consultingClient.getCpf());
    }

    @Test
    public void excluirCliente(){
        clienteDAO.delete(client.getCpf());
    }

    @Test
    public void updateClient(){
        clienteDAO.update(client);
    }
}

package org.github.juniottemp.domain.model;

import org.github.juniottemp.domain.services.ClientServices;
import org.github.juniottemp.domain.services.IClientService;
import org.github.juniottemp.domain.services.IClienteDAO;
import org.github.juniottemp.mocks.IClientDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientServiceTest {
    private IClientService clientService;

    private Client client;

    public ClientServiceTest(){
        IClienteDAO dao = new IClientDaoMock();
        this.clientService = new ClientServices(dao);
    }

    @Before
    public void init(){
        client = new Client();
        client.setNome("Joselito Junior");
        client.setCpf("24111758843");
        client.setBanco(Banco.ITAU);
        client.setCidade(Cidade.SAO_PAULO);

        clientService.save(client);
    }

    @Test
    public void pesquisarCliente(){

        Client consultingClient = clientService.findByCpf(client.getCpf());

        Assert.assertNotNull(client);
        Assert.assertEquals(client.getCpf(), consultingClient.getCpf());
    }

    @Test
    public void salvar(){
        Boolean clientSaveIs = clientService.save(client);
        Assert.assertTrue(clientSaveIs);
    }

    @Test
    public void excluirCliente(){
        clientService.excluir(client.getCpf());
    }

    @Test
    public void updateClient(){
        client.setNome("José Junior");
        clientService.atualizar(client);

        Assert.assertEquals("José Junior", client.getNome());
    }
}
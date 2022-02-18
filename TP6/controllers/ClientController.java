package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;

public class ClientController {

    ClientService clientService;

    public Client save(Client c){

        System.out.println("Client Controller level1");
        return clientService.save(c);
    }

    public ClientController (){

        System.out.println("Call ClientController ");
    }

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
        System.out.println("call Client Controller with ClientService Parametre....");
    }
}

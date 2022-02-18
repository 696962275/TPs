package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl  implements ClientService{

    ClientRepository clientRepository ;
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level 1 ");
        return clientRepository.save(c);
    }

    public ClientServiceImpl(){
        System.out.println("Call ClientServiceImpl");
    }

    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;

    }

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
        System.out.println("Call ClientRepository with parametre");
    }
}

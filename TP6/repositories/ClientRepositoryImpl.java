package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import org.omg.CORBA.SystemException;

public class ClientRepositoryImpl implements ClientRepository {
    public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepository Level1 ");
        return null;
    }

    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepositoryImpl");

    }
}

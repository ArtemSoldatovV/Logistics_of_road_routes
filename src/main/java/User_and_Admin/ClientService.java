package User_and_Admin;

import java.util.List;

public interface ClientService {
    List<Client> findAllClients();
    Client findClientByUsername(String username);
}
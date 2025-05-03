package repository;

import entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> findAllClients();
    Client findClientByUsername(String username);
}
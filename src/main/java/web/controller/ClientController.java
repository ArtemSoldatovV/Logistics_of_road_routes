package web.controller;

import entity.Client;
import repository.ClientService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService; // ваш сервис для работы с клиентами

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // Только администраторы могут получить список всех клиентов
    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<Client> getAllClients() {
        return clientService.findAllClients();
    }

    // Пользователь может получить только свои данные (например, по username)
    @GetMapping("/me")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Client getMyClientData(Authentication authentication) {
        String username = authentication.getName();
        return clientService.findClientByUsername(username);
    }
}
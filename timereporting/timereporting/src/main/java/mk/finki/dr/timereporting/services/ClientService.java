package mk.finki.dr.timereporting.services;

import mk.finki.dr.timereporting.models.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    List<Client> findAll();
    Client findById(Integer id);
    void deleteClientById(Integer id);
    Client save (Client client);

}

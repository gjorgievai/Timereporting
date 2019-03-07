package mk.finki.dr.timereporting.serviceImpl;

import mk.finki.dr.timereporting.models.Client;
import mk.finki.dr.timereporting.repositories.ClientRepository;
import mk.finki.dr.timereporting.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository repo;
    @Override
    public List<Client> findAll() {
        return repo.findAll();
    }

    @Override
    public Client findById(Integer id) {
        return repo.getOne(id);
    }

    @Override
    public void deleteClientById(Integer id) {
            repo.deleteById(id);
    }

    @Override
    public Client save(Client client) {
        return repo.save(client);
    }
}

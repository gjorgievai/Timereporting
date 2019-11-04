package mk.finki.dr.timereporting.controllers;

import mk.finki.dr.timereporting.models.Client;
import mk.finki.dr.timereporting.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/clients")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

    @Autowired
    ClientService service;
    @GetMapping
    public List<Client> getEmployee() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Client getEmployeeById(@PathVariable Integer id) {
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        service.deleteClientById(id);
    }
    @PostMapping
    public void createEmployee(@RequestBody Client client) {
        service.save(client);
    }
}

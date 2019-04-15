package mk.finki.dr.timereporting.controllers;

import mk.finki.dr.timereporting.models.Role;
import mk.finki.dr.timereporting.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    RoleService service;
    @GetMapping
    public List<Role> getRoles() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Integer id) {
        return service.findOne(id);
    }
    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id) {
        service.deleteRole(id);
    }
    @PostMapping("/create")
    public void createRole(@RequestBody Role role) {
        service.save(role);
    }
}

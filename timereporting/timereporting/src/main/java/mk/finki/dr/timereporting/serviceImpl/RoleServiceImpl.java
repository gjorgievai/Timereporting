package mk.finki.dr.timereporting.serviceImpl;

import mk.finki.dr.timereporting.models.Role;
import mk.finki.dr.timereporting.repositories.RoleRepository;
import mk.finki.dr.timereporting.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository repo;
    @Override
    public List<Role> findAll() {
        return repo.findAll();
    }

    @Override
    public Role findOne(Integer id) {
        return repo.getOne(id);
    }

    @Override
    public void deleteRole(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Role save(Role role) {
        return repo.save(role);
    }
}

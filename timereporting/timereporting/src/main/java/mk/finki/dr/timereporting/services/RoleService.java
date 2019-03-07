package mk.finki.dr.timereporting.services;

import mk.finki.dr.timereporting.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role findOne(Integer id);
    void deleteRole(Integer id);
    Role save(Role role);
}

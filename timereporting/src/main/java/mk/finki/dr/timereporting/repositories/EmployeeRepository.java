package mk.finki.dr.timereporting.repositories;

import mk.finki.dr.timereporting.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mk.finki.dr.timereporting.models.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByUsernameAndPassword(String username,String password);
    Employee findByUsername(String username);
}

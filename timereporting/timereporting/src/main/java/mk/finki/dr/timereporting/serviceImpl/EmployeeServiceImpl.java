package mk.finki.dr.timereporting.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mk.finki.dr.timereporting.models.Employee;
import mk.finki.dr.timereporting.repositories.EmployeeRepository;
import mk.finki.dr.timereporting.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public List<Employee> findAll() {
		return repo.findAll();
	}

	@Override
	public Employee findOne(Integer id) {
		return repo.getOne(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

}

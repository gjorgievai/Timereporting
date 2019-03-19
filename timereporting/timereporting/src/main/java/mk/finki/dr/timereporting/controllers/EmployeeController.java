package mk.finki.dr.timereporting.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mk.finki.dr.timereporting.models.Employee;
import mk.finki.dr.timereporting.repositories.EmployeeRepository;
import mk.finki.dr.timereporting.services.EmployeeService;
@RequestMapping("/employee")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service ;
	
	@GetMapping
	public List<Employee> getEmployee() {
		return service.findAll();
	}
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		return service.findOne(id);
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		service.deleteEmployee(id);
	}
	@PostMapping("/create")
	public void createEmployee(@RequestBody Employee employee) {
		service.save(employee);
	}

}

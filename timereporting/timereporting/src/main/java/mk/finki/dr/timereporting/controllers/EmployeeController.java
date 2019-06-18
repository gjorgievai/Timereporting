package mk.finki.dr.timereporting.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import mk.finki.dr.timereporting.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mk.finki.dr.timereporting.models.Employee;
import mk.finki.dr.timereporting.repositories.EmployeeRepository;
import mk.finki.dr.timereporting.services.EmployeeService;
@RequestMapping("/employee")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
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
	@GetMapping("/{username}")
	public Employee getEmployeeByUsername(@PathVariable String username) {
		return service.findByUsername(username);
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		service.deleteEmployee(id);
	}
	@PostMapping
	public void createEmployee(@RequestBody Employee employee) {
		service.save(employee);
	}
	@PutMapping
	public Employee updateEmpoyee(@RequestBody Employee newEmployee){
		return service.save(newEmployee);
	}
	@PostMapping("/login")
	public Employee loginEmployee(@RequestBody User employee){
		return service.login(employee);
	}


}

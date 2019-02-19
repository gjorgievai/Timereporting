package mk.finki.dr.timereporting.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}

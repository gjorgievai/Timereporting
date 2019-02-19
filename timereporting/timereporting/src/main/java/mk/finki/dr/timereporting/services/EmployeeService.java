package mk.finki.dr.timereporting.services;

import java.util.List;

import mk.finki.dr.timereporting.models.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	public Employee findOne(Integer id);
	public void deleteEmployee(Integer id);

}

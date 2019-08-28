package mk.finki.dr.timereporting.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
public class Timereport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date date;
	@NotNull
	private Integer hours;

	@NotNull
	@ManyToOne
	private Employee employee;
	@NotNull
	@ManyToOne
	private  Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Timereport (){}
	public Timereport(@NotNull Date date, @NotNull Integer hours ,@NotNull Integer employeeId,@NotNull Integer projectId) {
		this.date = date;
		this.hours = hours;
		this.employee.setId(employeeId);
		this.project.setId(projectId);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
}

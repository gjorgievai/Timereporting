package mk.finki.dr.timereporting.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String embg;
	private String mobile;
	private String street;
	private String city;
	@NotNull
	private String dateJoining;
	@ManyToOne
	@NotNull
	private Role role;
	@ManyToMany
	@NotNull
	private List<Project> projects;
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDateJoining() {
		return dateJoining;
	}
	public void setDateJoining(String dateJoining) {
		this.dateJoining = dateJoining;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmbg() {
		return embg;
	}
	public void setEmbg(String embg) {
		this.embg = embg;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Employee() {}
	public Employee(String firstName, String lastName, String embg, String mobile, String street, String city,
			String dateJoining) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.embg = embg;
		this.mobile = mobile;
		this.street = street;
		this.city = city;
		this.dateJoining = dateJoining;
	};
	
}

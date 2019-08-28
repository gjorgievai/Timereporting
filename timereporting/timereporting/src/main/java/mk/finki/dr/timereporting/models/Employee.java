package mk.finki.dr.timereporting.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
	private String username;
	private String password;
	@NotNull
	private String email;
	@NotNull
	private Date dateJoining;
	private Integer totalHours;

	public Integer getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(Integer totalHours) {
		this.totalHours = totalHours;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToOne
	private Role role;
	@ManyToMany(cascade = CascadeType.PERSIST)
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
	public Date getDateJoining() {
		return dateJoining;
	}
	public void setDateJoining(Date dateJoining) {
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

	public Employee(@NotNull String firstName, @NotNull String lastName, @NotNull String embg, String mobile, String street, String city, String username, String password, @NotNull String email, @NotNull Date dateJoining, Role role, List<Project> projects,Integer totalHours) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.embg = embg;
		this.mobile = mobile;
		this.street = street;
		this.city = city;
		this.username = username;
		this.password = password;
		this.email = email;
		this.dateJoining = dateJoining;
		this.role=role;
		this.projects = projects;
		this.totalHours = totalHours;
	}

}

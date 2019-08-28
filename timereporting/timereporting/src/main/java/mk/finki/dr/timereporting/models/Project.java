package mk.finki.dr.timereporting.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull
	private String name;
	@NotNull
	private int budget;
	@NotNull
	private int hourlyPaid;
	public int getHourlyPaid() {
		return hourlyPaid;
	}
	public void setHourlyPaid(int hourlyPaid) {
		this.hourlyPaid = hourlyPaid;
	}
	@OneToMany
	private List<Timereport> timereportList;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public Project(@NotNull String name, @NotNull int id, @NotNull int budget,@NotNull int hourlyPaid) {
		this.name = name;
		this.budget = budget;
		this.hourlyPaid =hourlyPaid;
		this.id=id;
	}
	public Project() {}

}

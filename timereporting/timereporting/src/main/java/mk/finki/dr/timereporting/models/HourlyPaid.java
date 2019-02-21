package mk.finki.dr.timereporting.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
@Entity
public class HourlyPaid {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull
	private int cost;
	@OneToOne
	@NotNull
	private Project project;
	@OneToOne
	@NotNull
	private Role role;

}

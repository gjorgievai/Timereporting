package mk.finki.dr.timereporting.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
public class HourlyPaid {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull
	private int cost;
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	private Project project;
	@OneToOne
	@NotNull
	private Role role;

}

package mk.finki.dr.timereporting.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class HourlyPaid {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private int cost;
	@OneToOne
	private Project project;
	@OneToOne
	private Role role;

}

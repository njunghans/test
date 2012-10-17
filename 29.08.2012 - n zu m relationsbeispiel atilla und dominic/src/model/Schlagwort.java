package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the SCHLAGWORTE database table.
 * 
 */
@Entity
@Table(name = "SCHLAGWORTE", schema = "RELATION")
public class Schlagwort implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	// bi-directional many-to-many association to Gueter
	@ManyToMany
	@JoinTable(schema = "RELATION", name = "GUETERSCHLAGWORTE", joinColumns = { @JoinColumn(name = "SCHLAGWORTE_ID") }, inverseJoinColumns = { @JoinColumn(name = "GUETER_ID") })
	private List<Gueter> gueters;

	public Schlagwort() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Gueter> getGueters() {
		return this.gueters;
	}

	public void setGueters(List<Gueter> gueters) {
		this.gueters = gueters;
	}

}
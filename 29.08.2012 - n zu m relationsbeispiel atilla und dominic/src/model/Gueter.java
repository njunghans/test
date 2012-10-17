package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the GUETER database table.
 * 
 */
@Entity
@Table(schema = "RELATION")
public class Gueter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String beschreibung;

	//bi-directional many-to-many association to Schlagwort
	@ManyToMany(mappedBy="gueters")
	private List<Schlagwort> schlagwortes;

	public Gueter() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public List<Schlagwort> getSchlagwortes() {
		return this.schlagwortes;
	}

	public void setSchlagwortes(List<Schlagwort> schlagwortes) {
		this.schlagwortes = schlagwortes;
	}

}
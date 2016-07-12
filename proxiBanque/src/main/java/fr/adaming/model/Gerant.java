package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="GerantEntity")
@Table(name="gerants")
public class Gerant extends Personne {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_gerant")
	private int id_gerant;

	@OneToOne
	@JoinColumn(name="id_agence",referencedColumnName="id_agence")
	private Agence agence;
	/**
	 * 
	 */
	public Gerant() {
	}

	/**
	 * @param agence
	 */
	public Gerant(String nom, String prenom,Agence agence) {
		super(nom,prenom);
		this.agence = agence;
	}

	/**
	 * @param id_gerant
	 * @param agence
	 */
	public Gerant(int id_gerant,String nom, String prenom, Agence agence) {
		super(nom,prenom);
		this.id_gerant = id_gerant;
		this.agence = agence;
	}



	/**
	 * @return the id_gerant
	 */
	public int getId_gerant() {
		return id_gerant;
	}

	/**
	 * @param id_gerant the id_gerant to set
	 */
	public void setId_gerant(int id_gerant) {
		this.id_gerant = id_gerant;
	}

	/**
	 * @return the agence
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * @param agence the agence to set
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gerant [id_gerant=" + id_gerant + ", agence=" + agence + "]";
	}

}

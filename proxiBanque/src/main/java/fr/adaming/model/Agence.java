package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="AgenceEntity")
@Table(name="agences")
public class Agence implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_agence")
	private String id_agence;
	@Column(name="date_creation")
	private Date date_creation;
	
	@OneToOne(mappedBy="agence")
	private Gerant gerant;
	
	/**
	 * 
	 */
	public Agence() {
	}
	/**
	 * @param id_agence
	 * @param date_creation
	 */
	public Agence(String id_agence, Date date_creation) {
		this.id_agence = id_agence;
		this.date_creation = date_creation;
	}
	/**
	 * @return the id_agence
	 */
	public String getId_agence() {
		return id_agence;
	}
	/**
	 * @param id_agence the id_agence to set
	 */
	public void setId_agence(String id_agence) {
		this.id_agence = id_agence;
	}
	/**
	 * @return the date_creation
	 */
	public Date getDate_creation() {
		return date_creation;
	}
	/**
	 * @param date_creation the date_creation to set
	 */
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agence [id_agence=" + id_agence + ", date_creation="
				+ date_creation + "]";
	}
	
}

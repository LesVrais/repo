package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

public class Agence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id_agence;
	private Date date_creation;
	
	
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

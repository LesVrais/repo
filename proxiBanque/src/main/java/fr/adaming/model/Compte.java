package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

public abstract class Compte implements Serializable {
	
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;


	private String id_compte;
	private double solde;
	private Date date_creation;
	
	/**
	 * 
	 */
	public Compte() {
	}
	/**
	 * @param id_compte
	 * @param solde
	 * @param date_creation
	 */
	public Compte(String id_compte, double solde, Date date_creation) {
		this.id_compte = id_compte;
		this.solde = solde;
		this.date_creation = date_creation;
	}
	
	/**
	 * @return the id_compte
	 */
	public String getId_compte() {
		return id_compte;
	}
	/**
	 * @param id_compte the id_compte to set
	 */
	public void setId_compte(String id_compte) {
		this.id_compte = id_compte;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
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
		return "Compte [id_compte=" + id_compte + ", solde=" + solde
				+ ", date_creation=" + date_creation + "]";
	}

}

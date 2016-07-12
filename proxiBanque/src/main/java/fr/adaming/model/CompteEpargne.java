package fr.adaming.model;

import java.util.Date;

import javax.persistence.OneToOne;

public class CompteEpargne extends Compte {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double taux=3;

	@OneToOne(mappedBy="compteEpargne")
	private Client client;
	
	/**
	 * 
	 */
	public CompteEpargne() {
		super();
	}

	/**
	 * @param taux
	 * @param client
	 */
	public CompteEpargne(String id_compte, double solde, Date date_creation, double taux, Client client) {
		super(id_compte, solde, date_creation);
		this.taux = taux;
		this.client = client;
	}

	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + ", client=" + client + "]";
	}

}

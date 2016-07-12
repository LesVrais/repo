package fr.adaming.model;

import java.util.Date;

import javax.persistence.OneToOne;

public class CompteCourant extends Compte {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long decouvert=1000;
	
	@OneToOne(mappedBy="compteCourant")
	private Client client;

	/**
	 * 
	 */
	public CompteCourant() {
		super();
	}

	/**
	 * @param decouvert
	 * @param client
	 */
	public CompteCourant(String id_compte, double solde, Date date_creation, long decouvert, Client client) {
		super(id_compte,solde,date_creation);
		this.decouvert = decouvert;
		this.client = client;
	}

	/**
	 * @return the decouvert
	 */
	public long getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(long decouvert) {
		this.decouvert = decouvert;
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
		return "CompteCourant [decouvert=" + decouvert + ", client=" + client
				+ "]";
	}

}

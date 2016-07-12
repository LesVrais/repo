package fr.adaming.model;

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
	public CompteCourant(long decouvert, Client client) {
		super();
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

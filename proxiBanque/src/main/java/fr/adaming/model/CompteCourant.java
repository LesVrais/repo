package fr.adaming.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="CompteCourantEntity")
@Table(name="compte_courant")
public class CompteCourant extends Compte {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="decouvert")
	private long decouvert=1000;
	@OneToOne(mappedBy="compteCourant", fetch = FetchType.LAZY)
	@JoinColumn(name="id_client",referencedColumnName="id_client")
	private Client client;

	/**
	 * 
	 */
	public CompteCourant() {
		super();
	}

	/**
	 * @param decouvert
	 */
	public CompteCourant(String id_compte) {
		super(id_compte);
	}
	
	/**
	 * @param decouvert
	 */
	public CompteCourant(String id_compte, double solde, Date date_creation) {
		super(id_compte,solde,date_creation);
	}
	
	/**
	 * @param decouvert
	 */
	public CompteCourant(String id_compte, double solde, Date date_creation, long decouvert) {
		super(id_compte,solde,date_creation);
		this.decouvert = decouvert;
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

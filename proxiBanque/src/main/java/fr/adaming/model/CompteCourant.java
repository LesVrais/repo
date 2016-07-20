package fr.adaming.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compteCourant")
	private int id_compteCourant;
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
	public CompteCourant(int id_compteCourant) {
		this.id_compteCourant = id_compteCourant;
	}
	
	/**
	 * @param decouvert
	 */
	public CompteCourant(int id_compteCourant, double solde, Date date_creation) {
		super(solde,date_creation);
	}
	
	/**
	 * @param decouvert
	 */
	public CompteCourant(int id_compteCourant, double solde, Date date_creation, long decouvert) {
		super(solde,date_creation);
		this.decouvert = decouvert;
		this.id_compteCourant = id_compteCourant;
	}



	/**
	 * @param decouvert
	 * @param client
	 */
	public CompteCourant(int id_compteCourant, double solde, Date date_creation, long decouvert, Client client) {
		super(solde,date_creation);
		this.decouvert = decouvert;
		this.client = client;
		this.id_compteCourant = id_compteCourant;
	}

	/**
	 * @return the id_compteCourant
	 */
	public int getId_compteCourant() {
		return id_compteCourant;
	}

	/**
	 * @param id_compteCourant the id_compteCourant to set
	 */
	public void setId_compteCourant(int id_compteCourant) {
		this.id_compteCourant = id_compteCourant;
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

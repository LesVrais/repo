package fr.adaming.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="CompteEpargneEntity")
@Table(name="compte_epargne")
public class CompteEpargne extends Compte {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Column(name="taux")
	private double taux=0.03;
	@OneToOne(mappedBy="compteEpargne", fetch = FetchType.LAZY)
	@JoinColumn(name="id_client",referencedColumnName="id_client")
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
	public CompteEpargne(String id_compte) {
		super(id_compte);
	}
	
	/**
	 * @param taux
	 * @param client
	 */
	public CompteEpargne(String id_compte, double solde, Date date_creation) {
		super(id_compte, solde, date_creation);
	}
	
	/**
	 * @param taux
	 * @param client
	 */
	public CompteEpargne(String id_compte, double solde, Date date_creation, double taux) {
		super(id_compte, solde, date_creation);
		this.taux = taux;
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

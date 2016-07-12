package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="ClientEntity")
@Table(name="clients")
public class Client extends Personne {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int id_client;
	@Column(name="adresse")
	private String adresse;
	@Column(name="cp")
	private int cp;
	@Column(name="ville")
	private String ville;
	@Column(name="telephone")
	private long telephone;
	@Column(name="carte")
	private String carte;

	/**
	 * 
	 */
	public Client() {
		super();
	}
	/**
	 * @param adresse
	 * @param cp
	 * @param ville
	 * @param telephone
	 * @param carte
	 */
	public Client(String adresse, int cp, String ville, long telephone,
			String carte) {
		super();
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.telephone = telephone;
		this.carte = carte;
	}
	/**
	 * @param id_client
	 * @param adresse
	 * @param cp
	 * @param ville
	 * @param telephone
	 * @param carte
	 */
	public Client(int id_client, String adresse, int cp, String ville,
			long telephone, String carte) {
		super();
		this.id_client = id_client;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.telephone = telephone;
		this.carte = carte;
	}
	/**
	 * @return the id_client
	 */
	public int getId_client() {
		return id_client;
	}
	/**
	 * @param id_client the id_client to set
	 */
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the cp
	 */
	public int getCp() {
		return cp;
	}
	/**
	 * @param cp the cp to set
	 */
	public void setCp(int cp) {
		this.cp = cp;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the telephone
	 */
	public long getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the carte
	 */
	public String getCarte() {
		return carte;
	}
	/**
	 * @param carte the carte to set
	 */
	public void setCarte(String carte) {
		this.carte = carte;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [id_client=" + id_client + ", adresse=" + adresse
				+ ", cp=" + cp + ", ville=" + ville + ", telephone="
				+ telephone + ", carte=" + carte + "]";
	}

}

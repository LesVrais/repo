package fr.adaming.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class Conseiller extends Personne {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id_conseiller;
	
	@OneToMany(mappedBy="conseiller", cascade=CascadeType.DETACH)
	private List<Client> listClient;

	/**
	 * 
	 */
	public Conseiller() {
		super();
	}

	/**
	 *
	 */
	public Conseiller(String nom, String prenom) {
		super(nom,prenom);
	}
	
	/**
	 * @param listClient
	 */
	public Conseiller(String nom, String prenom, List<Client> listClient) {
		super(nom,prenom);
		this.listClient = listClient;
	}

	/**
	 * @param id_conseiller
	 * @param listClient
	 */
	public Conseiller(int id_conseiller, String nom, String prenom, List<Client> listClient) {
		super(nom,prenom);
		this.id_conseiller = id_conseiller;
		this.listClient = listClient;
	}

	/**
	 * @return the id_conseiller
	 */
	public int getId_conseiller() {
		return id_conseiller;
	}

	/**
	 * @param id_conseiller the id_conseiller to set
	 */
	public void setId_conseiller(int id_conseiller) {
		this.id_conseiller = id_conseiller;
	}

	/**
	 * @return the listClient
	 */
	public List<Client> getListClient() {
		return listClient;
	}

	/**
	 * @param listClient the listClient to set
	 */
	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conseiller [id_conseiller=" + id_conseiller + ", listClient="
				+ listClient + "]";
	}

}

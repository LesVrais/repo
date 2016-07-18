package fr.adaming.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.adaming.model.Client;
import fr.adaming.model.Compte;
import fr.adaming.model.CompteEpargne;
import fr.adaming.model.Conseiller;
import fr.adaming.service.IConseillerService;

@ManagedBean(name="conseillerManagedBean")
@SessionScoped
public class ConseillerManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value="#{conseillerServiceBean}")
	IConseillerService conseillerService;

	private Conseiller conseiller;
	private Client client;

	private List<Client> listeClient;

	/**
	 * ctor
	 */
	public ConseillerManagedBean() {
		this.conseiller = new Conseiller();
		this.client = new Client();
	}

	//getter et setter
	/**
	 * @return the conseillerService
	 */
	public IConseillerService getConseillerService() {
		return conseillerService;
	}

	/**
	 * @param conseillerService the conseillerService to set
	 */
	public void setConseillerService(IConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}

	/**
	 * @return the conseiller
	 */
	public Conseiller getConseiller() {
		return conseiller;
	}

	/**
	 * @param conseiller the conseiller to set
	 */
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
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
	
	/**
	 * @return the listeClient
	 */
	public List<Client> getListeClient() {
		return listeClient;
	}

	/**
	 * @param listeConseiller the listeConseiller to set
	 */
	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}
	

	//methodes (sans parametre dans le MB)
	public void ajouterClientMB() {
		conseillerService.addClientService(client);
	}
	
	public void supprimerClientMB(){
		conseillerService.deleteClientService(client);
	}
	
	public void modifierClientrMB(){
		conseillerService.modifyClientService(client);
	}
	
	public List<Client> getAllClientMB(){
		return conseillerService.getAllClientService();
	}
	
	public Client getClientByIdMB(){
		return conseillerService.getClientByIdService(client.getId_client());
	}
	
}

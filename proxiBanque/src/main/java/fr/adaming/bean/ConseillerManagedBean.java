package fr.adaming.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.adaming.model.Client;
import fr.adaming.model.CompteCourant;
import fr.adaming.model.CompteEpargne;
import fr.adaming.model.Conseiller;
import fr.adaming.service.IConseillerService;
import fr.adaming.service.IGerantService;

@ManagedBean(name="conseillerManagedBean")
@SessionScoped
public class ConseillerManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value="#{conseillerServiceBean}")
	IConseillerService conseillerService;
	
	@ManagedProperty(value="#{gerantServiceBean}")
	IGerantService gerantService;

	private Conseiller conseiller;
	private Client client;
	private CompteCourant compteCo;
	private CompteEpargne compteEp;

	private List<Client> listeClient;

	/**
	 * ctor
	 */
	public ConseillerManagedBean() {
		this.conseiller = new Conseiller();
		this.client = new Client();
		this.compteCo = new CompteCourant();
		this.compteEp = new CompteEpargne();
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
	 * @return the gerantService
	 */
	public IGerantService getGerantService() {
		return gerantService;
	}

	/**
	 * @param gerantService the gerantService to set
	 */
	public void setGerantService(IGerantService gerantService) {
		this.gerantService = gerantService;
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

	/**
	 * @return the compteCo
	 */
	public CompteCourant getCompteCo() {
		return compteCo;
	}

	/**
	 * @param compteCo the compteCo to set
	 */
	public void setCompteCo(CompteCourant compteCo) {
		this.compteCo = compteCo;
	}

	/**
	 * @return the compteEp
	 */
	public CompteEpargne getCompteEp() {
		return compteEp;
	}

	/**
	 * @param compteEp the compteEp to set
	 */
	public void setCompteEp(CompteEpargne compteEp) {
		this.compteEp = compteEp;
	}

	//methodes (sans parametre ni retour dans le MB)
	public void ajouterClientMB() {
		Conseiller con = gerantService.getConseillerByIdService(conseiller.getId_conseiller());
		client.setConseiller(con);
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
	
	public void ajouterCompteCourant(){
		conseillerService.addCompteCourant(compteCo);
	}
	
	public void ajouterCompteEpargne(){
		conseillerService.addCompteEpargne(compteEp);
	}
	
	public void supprimerCompteCourant(){
		conseillerService.deleteCompteCourant(compteCo);
	}
	
	public void supprimerCompteEpargne(){
		conseillerService.deleteCompteEpargne(compteEp);
	}
	
}

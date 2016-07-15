package fr.adaming.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.adaming.model.Conseiller;
import fr.adaming.service.IGerantService;

@ManagedBean(name="gerantManagedBean")
@SessionScoped
public class GerantManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value="#{gerantServiceBean}")
	IGerantService gerantService;

	private Conseiller conseiller;
	
	private List<Conseiller> listeConseiller;

	/**
	 * ctor
	 */
	public GerantManagedBean() {
		this.conseiller = new Conseiller();
	}

	//getter et setter
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
	 * @return the listeConseiller
	 */
	public List<Conseiller> getListeConseiller() {
		return listeConseiller;
	}

	/**
	 * @param listeConseiller the listeConseiller to set
	 */
	public void setListeConseiller(List<Conseiller> listeConseiller) {
		this.listeConseiller = listeConseiller;
	}

	//methodes (sans parametre dans le MB
	public void ajouterConseillerMB() {
		gerantService.addConseillerService(conseiller);
	}
	
	public void supprimerConseillerMB(){
		gerantService.deleteConseillerService(conseiller);
	}
	
	public void modifierConseillerMB(){
		gerantService.modifyConseillerService(conseiller);
	}
	
	public List<Conseiller> getAllConseillerMB(){
		return gerantService.getAllConseillerService();
	}
	
	public Conseiller getConseillerByIdMB(){
		return gerantService.getConseillerByIdService(conseiller.getId_conseiller());
	}
}

package fr.adaming.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.adaming.model.Conseiller;
import fr.adaming.model.Gerant;
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
	private Gerant gerant;

	private List<Conseiller> listeConseiller;

	/**
	 * ctor
	 */
	public GerantManagedBean() {
		this.conseiller = new Conseiller();
		this.gerant = new Gerant();
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
	
	/**
	 * @return the gerant
	 */
	public Gerant getGerant() {
		return gerant;
	}

	/**
	 * @param gerant the gerant to set
	 */
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	//methodes (sans parametre dans le MB)
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
	
//	public String isExistMB(){
//		long verif = gerantService.isExistService(gerant.getId_gerant(),gerant.getNom());
//		
//		if(verif==1){
//			this.listeConseiller = gerantService.getAllConseillerService();
//			return "succes";
//		}else{
//			return "echec";
//		}
//	}
}

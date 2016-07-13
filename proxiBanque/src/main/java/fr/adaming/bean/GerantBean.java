package fr.adaming.bean;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.adaming.model.Conseiller;
import fr.adaming.service.IGerantService;

@ManagedBean(value="gerantBean")
@SessionScoped
public class GerantBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value="#{gerantServiceBean}")
	IGerantService gerantService;

	private Conseiller conseiller;

	/**
	 * 
	 */
	public GerantBean() {
		this.conseiller = new Conseiller();
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
	
	public void ajouter() {
		gerantService.addConseiller(conseiller);
	}
}

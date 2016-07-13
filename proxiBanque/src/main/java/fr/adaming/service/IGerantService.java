package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Conseiller;

public interface IGerantService {

	public List<Conseiller> getAllConseiller();
	public Conseiller getConseillerById(int id);
	public void addConseiller(Conseiller c);
	public void deleteConseiller(int id);
	public void modifyConseiller(int id, String nom, String prenom);
	
}

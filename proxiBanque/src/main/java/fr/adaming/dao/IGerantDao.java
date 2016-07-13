package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Conseiller;

public interface IGerantDao {
	
	public List<Conseiller> getAllConseiller();
	public Conseiller getConseillerById(int id);
	public void addConseiller(Conseiller c);
	public void deleteConseiller(int id);
	public void modifyConseiller(int id, String nom, String prenom);

}

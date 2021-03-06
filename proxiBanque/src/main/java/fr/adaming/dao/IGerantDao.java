package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

public interface IGerantDao {
	
	public List<Conseiller> getAllConseiller();
	public Conseiller getConseillerById(int id);
	public void addConseiller(Conseiller c);
	public void deleteConseiller(Conseiller c);
	public void modifyConseiller(Conseiller c);
	public List<Client> getAllClientByConseiller(Conseiller c);
//	public long isExist(int id, String nom);

}

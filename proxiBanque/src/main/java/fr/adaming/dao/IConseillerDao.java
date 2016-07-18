package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Client;
import fr.adaming.model.Compte;
import fr.adaming.model.CompteCourant;
import fr.adaming.model.CompteEpargne;

public interface IConseillerDao {
	
	public List<Client> getAllClients();
	public Client getClientById(int id);
	public void addClient(Client cl);
	public void deleteClient(Client cl);
	public void modifyClient(Client cl);
	
	public void addCompteCourant(Compte compte);
	public void addCompteEpargne(Compte compte);
	public void deleteCompteCourant(Compte compte);
	public void deleteCompteEpargne(Compte compte);
	public List<CompteCourant> getAllCompteCourant();
	public List<CompteEpargne> getAllCompteEpargne();
	public Compte getCompteById(String id);
	
	public void virement(Compte compte1, Compte compte2, double somme);

}

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
	
	public void addCompteCourant(CompteCourant compteCo);
	public void addCompteEpargne(CompteEpargne compteEp);
	public void deleteCompteCourant(CompteCourant compteCo);
	public void deleteCompteEpargne(CompteEpargne compteEp);
	public List<Object> getAllCompteByClient(Client c);

}

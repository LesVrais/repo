package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Client;
import fr.adaming.model.Compte;
import fr.adaming.model.CompteCourant;
import fr.adaming.model.CompteEpargne;

public interface IConseillerService {
	
	public List<Client> getAllClientService();
	public Client getClientByIdService(int id);
	public void addClientService(Client c);
	public void deleteClientService(Client c);
	public void modifyClientService(Client c);
	
	public void addCompteCourant(Compte compte);
	public void addCompteEpargne(Compte compte);
	public void deleteCompteCourant(Compte compte);
	public void deleteCompteEpargne(Compte compte);
	public List<CompteCourant> getAllCompteCourant();
	public List<CompteEpargne> getAllCompteEpargne();
}

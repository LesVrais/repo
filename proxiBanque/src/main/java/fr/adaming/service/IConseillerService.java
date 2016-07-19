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
	
	public void addCompteCourant(CompteCourant compteCo);
	public void addCompteEpargne(CompteEpargne compteEp);
	public void deleteCompteCourant(CompteCourant compteCo);
	public void deleteCompteEpargne(CompteEpargne compteEp);
	public List<Object> getAllCompteByClient(Client c);

}

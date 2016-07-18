package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Client;

public interface IConseillerService {
	
	public List<Client> getAllClientService();
	public Client getClientByIdService(int id);
	public void addClientService(Client c);
	public void deleteClientService(Client c);
	public void modifyClientService(Client c);
}

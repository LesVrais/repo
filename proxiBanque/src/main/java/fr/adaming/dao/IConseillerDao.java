package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Client;

public interface IConseillerDao {
	
	public List<Client> getAllClients();
	public Client getClientById(int id);
	public void addClient(Client cl);
	public void deleteClient(Client cl);
	public void modifyClient(Client cl);

}

package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Client;

public interface IConseillerDao {
	
	public List<Client> getAllClients();
	public Client getClientById();
	public void addClient(Client cl);
	public void deleteClient(int id);
	public void modifyClient();

}

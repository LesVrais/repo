package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Conseiller;

public interface IGerantService {

	public List<Conseiller> getAllConseillerService();
	public Conseiller getConseillerByIdService(int id);
	public void addConseillerService(Conseiller c);
	public void deleteConseillerService(Conseiller c);
	public void modifyConseillerService(Conseiller c);
	public long isExistService(int id, String nom);
	
}

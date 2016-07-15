package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IConseillerDao;
import fr.adaming.dao.IGerantDao;
import fr.adaming.model.Conseiller;

@Service("gerantServiceBean")
public class GerantServiceImpl implements IGerantService{

	@Autowired
	private IGerantDao gerantDao;
	
	//setter pour l'injection
	/**
	 * @param gerantDao the gerantDao to set
	 */
	public void setGerantDao(IGerantDao gerantDao) {
		this.gerantDao = gerantDao;
	}
	
	//Méthodes
	@Override
	public List<Conseiller> getAllConseillerService() {
		return gerantDao.getAllConseiller();
	}

	@Override
	public Conseiller getConseillerByIdService(int id) {
		return gerantDao.getConseillerById(id);
	}

	@Override
	public void addConseillerService(Conseiller c) {
		gerantDao.addConseiller(c);
	}

	@Override
	public void deleteConseillerService(Conseiller c) {
		gerantDao.deleteConseiller(c);
	}

	@Override
	public void modifyConseillerService(Conseiller c) {
		gerantDao.modifyConseiller(c);
	}

}

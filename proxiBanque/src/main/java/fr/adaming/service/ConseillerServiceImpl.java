package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IConseillerDao;
import fr.adaming.model.Client;

@Service("conseillerServiceBean")
public class ConseillerServiceImpl implements IConseillerService {

	@Autowired
	private IConseillerDao conseillerDao;

	/**
	 * @return the conseillerDao
	 */
	public IConseillerDao getConseillerDao() {
		return conseillerDao;
	}
	/**
	 * @param conseillerDao the conseillerDao to set
	 */
	public void setConseillerDao(IConseillerDao conseillerDao) {
		this.conseillerDao = conseillerDao;
	}

	@Override
	public List<Client> getAllClientService() {
		return conseillerDao.getAllClients();
	}

	@Override
	public Client getClientByIdService(int id) {
		return conseillerDao.getClientById(id);
	}

	@Override
	public void addClientService(Client c) {
		conseillerDao.addClient(c);
	}

	@Override
	public void deleteClientService(Client c) {
		conseillerDao.deleteClient(c);
	}

	@Override
	public void modifyClientService(Client c) {
		conseillerDao.modifyClient(c);
	}

}

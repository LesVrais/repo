package fr.adaming.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.model.Client;
import fr.adaming.model.CompteCourant;
import fr.adaming.model.CompteEpargne;

@Repository("conseillerDao")
@Transactional
public class ConseillerDaoImpl implements IConseillerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//Methodes clients
	@Override
	public List<Client> getAllClients() {
		Session session = sessionFactory.getCurrentSession();
		String reqHQL = "from ClientEntity c order by c.id_client asc";
		Query query = session.createQuery(reqHQL);
		List<Client> liste = query.list();
		return liste;
	}

	@Override
	public Client getClientById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Client client = (Client) session.get(Client.class, id);
		return client;
	}

	@Override
	public void addClient(Client cl) {
		Session session = sessionFactory.getCurrentSession();
		session.save(cl);
	}

	@Override
	public void deleteClient(Client cl) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "delete from ClientEntity c where c.id_client=:id";
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", cl.getId_client());
		query.executeUpdate();
	}

	@Override
	public void modifyClient(Client cl) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "update ClientEntity c set c.nom=:nom , c.prenom=:prenom , c.adresse=:adresse"
				+ ",c.cp=:cp , c.telephone=:telephone , c.ville=:ville where c.id_client=:id";
		
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", cl.getId_client());
		
		query.setParameter("nom", cl.getNom());
		query.setParameter("prenom", cl.getPrenom());
		query.setParameter("adresse", cl.getAdresse());
		query.setParameter("cp", cl.getCp());
		query.setParameter("telephone", cl.getTelephone());
		query.setParameter("ville", cl.getVille());
		
		query.executeUpdate();
	}
	
	
	//Methodes de compte

	@Override
	public void addCompteCourant(CompteCourant compteCo) {
		Session session = sessionFactory.getCurrentSession();
		compteCo.setDate_creation(new Date());
		session.save(compteCo);
	}

	@Override
	public void deleteCompteCourant(CompteCourant compteCo) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "delete from CompteCourantEntity cc where cc.id_compteCourant=:id";
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", compteCo.getId_compteCourant());
		query.executeUpdate();
	}

	@Override
	public void addCompteEpargne(CompteEpargne compteEp) {
		Session session = sessionFactory.getCurrentSession();
		compteEp.setDate_creation(new Date());
		session.save(compteEp);
	}

	@Override
	public void deleteCompteEpargne(CompteEpargne compteEp) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "delete from CompteEpargneEntity ce where ce.id_compteEpargne=:id";
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", compteEp.getId_compteEpargne());
		query.executeUpdate();
	}

	@Override
	public List<Object> getAllCompteByClient(Client c) {

		return null;
	}
}

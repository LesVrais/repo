package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

@Repository("gerantDao")
@Transactional
public class GerantDaoImpl implements IGerantDao {

	@Autowired
	private SessionFactory sessionFactory;

	//getter setter
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
	
	//Méthodes
	@Override
	public List<Conseiller> getAllConseiller() {
		Session session = sessionFactory.getCurrentSession();
		String reqHQL = "from ConseillerEntity c order by c.id_conseiller asc";
		Query query = session.createQuery(reqHQL);
		List<Conseiller> liste = query.list();
		return liste;
	}

	@Override
	public Conseiller getConseillerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Conseiller conseiller = (Conseiller) session.get(Conseiller.class, id);
		return conseiller;
	}

	@Override
	public void addConseiller(Conseiller c) {
		Session session = sessionFactory.getCurrentSession();
		session.save(c);
	}

	@Override
	public void deleteConseiller(Conseiller conseiller) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "delete from ConseillerEntity c where c.id_conseiller=:id";
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", conseiller.getId_conseiller());
		query.executeUpdate();
	}

	@Override
	public void modifyConseiller(Conseiller conseiller) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "update ConseillerEntity c set c.nom=:nom , c.prenom=:prenom where c.id_conseiller=:id";
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", conseiller.getId_conseiller());
		query.setParameter("nom", conseiller.getNom());
		query.setParameter("prenom", conseiller.getPrenom());
		query.executeUpdate();
	}

	@Override
	public List<Client> getAllClientByConseiller(Conseiller c) {
		
		Session session = sessionFactory.getCurrentSession();
		String reqHQL = "from ClientEntity cl where cl.id_conseiller=:id";
		Query query = session.createQuery(reqHQL);
		query.setInteger("id", c.getId_conseiller());
		query.executeUpdate();
		
		List<Client> listeCl = query.list();
		return listeCl;
	}

//	@Override
//	public long isExist(int id, String nom) {
//		Session session = sessionFactory.getCurrentSession();
//		String hqlReq = "select count(c.prenom) from GerantEntity c where c.id_gerant=:id and c.nom=:nom";
//		Query query = session.createQuery(hqlReq);
//		query.setInteger("id", id);
//		query.setParameter("nom", nom);
//		long result = (long) query.uniqueResult();
//		return result;
//	}

}

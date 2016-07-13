package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.model.Conseiller;

@Repository
@Transactional
public class GerantDaoImpl implements IGerantDao {

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
	
	@Override
	public List<Conseiller> getAllConseiller() {
		Session session = sessionFactory.getCurrentSession();
		String reqHQL = "FROM GerantEntity g order by g.id asc";
		Query query = session.createQuery(reqHQL);
		List<Conseiller> liste = query.list();
		return liste;
	}

	@Override
	public Conseiller getConseillerById(int id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addConseiller(Conseiller c) {
		Session session = sessionFactory.openSession();
		session.save(c);
		session.close();
	}

	@Override
	public void deleteConseiller(int id) {
		
	}

	@Override
	public void modifyConseiller(int id, String nom, String prenom) {
		
	}

}

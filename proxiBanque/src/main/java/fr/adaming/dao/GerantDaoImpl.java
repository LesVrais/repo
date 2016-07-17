package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
		Session session = sessionFactory.openSession();
		String reqHQL = "from ConseillerEntity c order by c.id_conseiller asc";
		Query query = session.createQuery(reqHQL);
		List<Conseiller> liste = query.list();
		session.close();
		return liste;
	}

	@Override
	public Conseiller getConseillerById(int id) {
		Session session = sessionFactory.openSession();
		Conseiller conseiller = (Conseiller) session.get(Conseiller.class, id);
		session.close();
		return conseiller;
	}

	@Override
	public void addConseiller(Conseiller c) {
		Session session = sessionFactory.openSession();
		session.save(c);
		session.close();
	}

	@Override
	public void deleteConseiller(Conseiller conseiller) {
		Session session = sessionFactory.openSession();
		String hqlReq = "delete from ConseillerEntity where id_conseiller=:id";
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", conseiller.getId_conseiller());
		query.executeUpdate();
		session.close();
	}

	@Override
	public void modifyConseiller(Conseiller conseiller) {
		Session session = sessionFactory.openSession();
		String hqlReq = "update from ConseillerEntity set nom:=nom and prenom=:prenom where id_conseiller:=id";
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", conseiller.getId_conseiller());
		query.setParameter("nom", conseiller.getNom());
		query.setParameter("prenom", conseiller.getPrenom());
		session.close();
	}

}

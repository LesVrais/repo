package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.model.Client;
import fr.adaming.model.Compte;
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
	
	// Genere un numero de compte aleatoire
	//Methode de compte
	public static String genererNumeroCompte() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; 
        StringBuffer pass = new StringBuffer();
        for(int x=0;x<5;x++)   {
           int i = (int)Math.floor(Math.random() * (chars.length() -1));
           pass.append(chars.charAt(i));
        }
        return pass.toString();
	}
	
	//Methodes de compte

	@Override
	public void addCompteCourant(CompteCourant compteCo) {
		Session session = sessionFactory.getCurrentSession();
		session.save(compteCo);
	}

	@Override
	public void deleteCompteCourant(CompteCourant compteCo) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "delete from CompteCourantEntity cc where cc.id_compte=:id";
		Query query = session.createQuery(hqlReq);
		query.setString("id", compteCo.getId_compte());
		query.executeUpdate();
	}

	@Override
	public void addCompteEpargne(CompteEpargne compteEp) {
		Session session = sessionFactory.getCurrentSession();
		session.save(compteEp);
	}

	@Override
	public void deleteCompteEpargne(CompteEpargne compteEp) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "delete from CompteEpargneEntity ce where ce.id_compte=:id";
		Query query = session.createQuery(hqlReq);
		query.setString("id", compteEp.getId_compte());
		query.executeUpdate();
	}

	@Override
	public List<Object> getAllCompteByClient(Client c) {
//		Session session = sessionFactory.getCurrentSession();
//		String reqHQL = "from CompteCourantEntity cc and CompteEpargneEntity ce where";
//		Query query = session.createQuery(reqHQL);
//		List<Compte> liste = query.list();
		return null;
	}
}

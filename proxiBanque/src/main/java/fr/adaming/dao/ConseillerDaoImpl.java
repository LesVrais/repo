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
import fr.adaming.model.Conseiller;

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
				+ ", c.carte=:carte , c.cp=:cp , c.telephone=:telephone , c.ville=:ville"
				+ " , c.conseiller.id_conseiller=:id_conseiller , c.compteCourant.id_compte=:id_compteCourant"
				+ " , c.compteEpargne.id_compte=:id_compteEpargne where c.id_client=:id";
		
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", cl.getId_client());
		
		query.setParameter("nom", cl.getNom());
		query.setParameter("prenom", cl.getPrenom());
		query.setParameter("adresse", cl.getAdresse());
		query.setParameter("carte", cl.getCarte());
		query.setParameter("cp", cl.getCp());
		query.setParameter("telephone", cl.getTelephone());
		query.setParameter("ville", cl.getVille());
		query.setParameter("id_conseiller", cl.getConseiller().getId_conseiller());
		query.setParameter("id_compteCourant", cl.getCompteCourant().getId_compte());
		query.setParameter("id_compteEpargne", cl.getCompteEpargne().getId_compte());
		
		query.executeUpdate();
	}
	
	// Genere un numero de compte alaetoire
	
	public static String genererNumeroCompte() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; 
        StringBuffer pass = new StringBuffer();
        for(int x=0;x<5;x++)   {
           int i = (int)Math.floor(Math.random() * (chars.length() -1));
           pass.append(chars.charAt(i));
        }
        return pass.toString();
	}
	
	@Override
	public List<CompteCourant> getAllCompteCourant() {
		Session session = sessionFactory.getCurrentSession();
		String reqHQL = "from CompteCourantEntity cc order by cc.id_compte asc";
		Query query = session.createQuery(reqHQL);
		List<CompteCourant> liste = query.list();
		return liste;
	}

	@Override
	public List<CompteEpargne> getAllCompteEpargne() {
		Session session = sessionFactory.getCurrentSession();
		String reqHQL = "from CompteEpargneEntity ce order by ce.id_compte asc";
		Query query = session.createQuery(reqHQL);
		List<CompteEpargne> liste = query.list();
		return liste;
	}

	@Override
	public void addCompteCourant(Compte compte) {
		Session session = sessionFactory.getCurrentSession();
		session.save(compte);
	}

	@Override
	public void addCompteEpargne(Compte compte) {
		Session session = sessionFactory.getCurrentSession();
		session.save(compte);
	}

	@Override
	public void deleteCompteCourant(Compte compte) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "delete from CompteCourantEntity cc where cc.id_compte=:id";
		Query query = session.createQuery(hqlReq);
		query.setString("id", compte.getId_compte());
		query.executeUpdate();
	}
	
	@Override
	public Compte getCompteById(String id) {
		Session session = sessionFactory.getCurrentSession();
		Compte compte = (Compte) session.get(Compte.class, id);
		return compte;
	}

	@Override
	public void deleteCompteEpargne(Compte compte) {
		Session session = sessionFactory.getCurrentSession();
		String hqlReq = "delete from CompteEpargneEntity ce where ce.id_compte=:id";
		Query query = session.createQuery(hqlReq);
		query.setString("id", compte.getId_compte());
		query.executeUpdate();
	}

	@Override
	public void virement(Compte compteDebit, Compte compteCredit, double somme) {
		double soldeCredit = compteCredit.getSolde();
		soldeCredit += somme;
		double soldeDebit = compteDebit.getSolde();
		soldeDebit -= somme;
	}



}

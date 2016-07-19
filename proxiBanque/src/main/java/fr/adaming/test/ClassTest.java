package fr.adaming.test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.adaming.dao.GerantDaoImpl;
import fr.adaming.dao.IConseillerDao;
import fr.adaming.dao.IGerantDao;
import fr.adaming.model.Client;
import fr.adaming.model.Compte;
import fr.adaming.model.CompteCourant;
import fr.adaming.model.CompteEpargne;
import fr.adaming.model.Conseiller;
import fr.adaming.service.WsPret;

public class ClassTest {

	public static void main(String[] args) {
		
//		ApplicationContext cxt = 
//				new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
//		
//		IConseillerDao conseillerDao = (IConseillerDao) cxt.getBean("conseillerDao");
//		IGerantDao gerantDao = (IGerantDao) cxt.getBean("gerantDao");
		
//		Client c1 = new Client("Lecouty", "Alexandre","adresse", 44000, "Nantes", (long) 0689457812.0);
//		Client c2 = new Client("Guillou", "Florian","adressssssse2", 75000,"Paris",(long) 0756897561.0);

//		Date date = Calendar.getInstance().getTime();
//		
//		System.out.println(date);
//		
//		CompteCourant cc = new CompteCourant("A2Z7A", 15000,date , 250);
//		CompteCourant cc1 = new CompteCourant("ED8SA", 75000,date);
//		
//		CompteEpargne ce = new CompteEpargne("F8D9Q", 1000,date , 2);
//		CompteEpargne ce2 = new CompteEpargne("A9E8D", 3000,date);
//		
//		conseillerDao.addCompteCourant(cc);
//		conseillerDao.addCompteCourant(cc1);
//		
//		conseillerDao.addCompteEpargne(ce);
//		conseillerDao.addCompteEpargne(ce2);
		
//		CompteEpargne ce3 = new CompteEpargne("1");
//		CompteCourant cc3 = new CompteCourant("1");
//		
//		conseillerDao.deleteCompteCourant(cc3);
//		conseillerDao.deleteCompteEpargne(ce3);
		
//		// Test de la methode ajouter conseiller (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Ajout de conseillers");
//		conseillerDao.addClient(c1);
//		conseillerDao.addClient(c2);

//		Conseiller c = new Conseiller();
//		CompteEpargne ce1 = new CompteEpargne();
//		CompteCourant cc = new CompteCourant();
//		c.setId_conseiller(3);
//		ce1.setId_compte("A9E8D");
//		cc.setId_compte("A2Z7A");
		
//		// Test de la methode modifier conseiller (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Modifier conseiller");
//
//		Client c5 = new Client(2,"Jackson", "Mickael", "rue des enfants", 69069, "Floride", (long) 0689457812.0,"mastercard", cc,ce,c);
//		conseillerDao.modifyClient(c5);
		
//		// Test de la methode supprimer conseiller (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Supprimer conseiller");
//		conseillerDao.deleteClient(c1);
//		
//		// Test de la methode getConseillerById (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Conseiller n°4");
//		Client client = conseillerDao.getClientById(2);
//		System.out.println(client);
//		
//		// Test de la methode getConseillerById (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Liste des conseillers");
//		List<Client> liste = conseillerDao.getAllClients();
//		for(Client c : liste){
//			System.out.println(c);
//		}

		// Test de la methode isExist (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Le gerant existe t'il ?");
//		long a = gerantDao.isExist(1, "Sinapi");
//		long b = gerantDao.isExist(825, "CeluiQuiNExistePas");
//		System.out.println("Retourne 1 normalement : " + a
//				         + ", retourne 0 normalement : " + b);
		
//		WsPret ws = new WsPret();
//		
//		System.out.println(ws.simulationImmo(10000, 3.5, 24));
//	
		}

}

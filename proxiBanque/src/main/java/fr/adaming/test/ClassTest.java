package fr.adaming.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.adaming.dao.GerantDaoImpl;
import fr.adaming.dao.IConseillerDao;
import fr.adaming.dao.IGerantDao;
import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

public class ClassTest {

	public static void main(String[] args) {
		
		ApplicationContext cxt = 
				new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		
		IConseillerDao conseillerDao = (IConseillerDao) cxt.getBean("conseillerDao");
		
		Client c1 = new Client(1,"Lecouty", "Alexandre","Nantes",44000,(long) 0689457812.0);
		Client c2 = new Client(2,"Guillou", "Florian","Paris",57981,(long) 0756897561.0);

//		// Test de la methode ajouter conseiller (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Ajout de conseillers");
//		conseillerDao.addClient(c1);
//		conseillerDao.addClient(c2);

		Conseiller c = new Conseiller();
		c.setId_conseiller(1);
		
		// Test de la methode modifier conseiller (CHECK)
		System.out.println("===========================================");
		System.out.println("Modifier conseiller");
		Client c5 = new Client(2, "Jackson", "Mickaela", "rue des enfants", 69069, (long) 0689457812.0);
		conseillerDao.modifyClient(c5);
		
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
	
		}

}

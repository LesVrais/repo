package fr.adaming.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.adaming.dao.GerantDaoImpl;
import fr.adaming.dao.IGerantDao;
import fr.adaming.model.Conseiller;

public class ClassTest {

	public static void main(String[] args) {
		
		ApplicationContext cxt = 
				new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		
		IGerantDao gerantDao = (IGerantDao) cxt.getBean("gerantDao");
		
		Conseiller c1 = new Conseiller("Lecouty", "Alexandre");
		Conseiller c2 = new Conseiller("Guillou", "Florian");
		Conseiller c3 = new Conseiller("Trump", "Donald");
		Conseiller c4 = new Conseiller("Clinton", "Hillary");

		// Test de la methode ajouter conseiller
		System.out.println("===========================================");
		System.out.println("Ajout de conseillers");
		gerantDao.addConseiller(c1);
		gerantDao.addConseiller(c2);
		gerantDao.addConseiller(c3);
		gerantDao.addConseiller(c4);
		
		// Test de la methode modifier conseiller
		System.out.println("===========================================");
		System.out.println("Modifier conseiller");
		Conseiller c5 = new Conseiller("Louis", "Jean",1);
		gerantDao.modifyConseiller(c5);
		
		// Test de la methode supprimer conseiller
		System.out.println("===========================================");
		System.out.println("Supprimer conseiller");
		gerantDao.deleteConseiller(c1);
		
		// Test de la methode getConseillerById
		System.out.println("===========================================");
		System.out.println("Conseiller n°4");
		gerantDao.getConseillerById(4);
		
		// Test de la methode getConseillerById
		System.out.println("===========================================");
		System.out.println("Liste des conseillers");
		gerantDao.getAllConseiller();

	}

}

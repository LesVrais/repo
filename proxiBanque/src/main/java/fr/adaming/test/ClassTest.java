package fr.adaming.test;

import java.util.List;

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
		
		Conseiller c1 = new Conseiller("Lecouty", "Alexandre",1);
		Conseiller c2 = new Conseiller("Guillou", "Florian");
		Conseiller c3 = new Conseiller("Trump", "Donald");
		Conseiller c4 = new Conseiller("Clinton", "Hillary");

//		// Test de la methode ajouter conseiller (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Ajout de conseillers");
//		gerantDao.addConseiller(c1);
//		gerantDao.addConseiller(c2);
//		gerantDao.addConseiller(c3);
//		gerantDao.addConseiller(c4);
		
		// Test de la methode modifier conseiller (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Modifier conseiller");
//		Conseiller c5 = new Conseiller("Louis", "Jean",2);
//		gerantDao.modifyConseiller(c5);
//		
//		// Test de la methode supprimer conseiller (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Supprimer conseiller");
//		gerantDao.deleteConseiller(c1);
//		
//		// Test de la methode getConseillerById (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Conseiller n°4");
//		Conseiller conseiller = gerantDao.getConseillerById(4);
//		System.out.println(conseiller);
//		
//		// Test de la methode getConseillerById (CHECK)
//		System.out.println("===========================================");
//		System.out.println("Liste des conseillers");
//		List<Conseiller> liste = gerantDao.getAllConseiller();
//		for(Conseiller c : liste){
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

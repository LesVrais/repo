package fr.adaming.test;

import fr.adaming.dao.GerantDaoImpl;
import fr.adaming.dao.IGerantDao;
import fr.adaming.model.Conseiller;

public class ClassTest {

	public static void main(String[] args) {
		
		IGerantDao gerantDao = new GerantDaoImpl();
		
		Conseiller c1 = new Conseiller("Lecouty", "Alexandre");
		Conseiller c2 = new Conseiller("Guillou", "Florian");
		Conseiller c3 = new Conseiller("Trump", "Donald");
		Conseiller c4 = new Conseiller("Clinton", "Hillary");

		// Test de la methode ajouter conseiller
		gerantDao.addConseiller(c1);
		gerantDao.addConseiller(c2);
		gerantDao.addConseiller(c3);
		gerantDao.addConseiller(c4);
		
		
		

	}

}

package fr.adaming.test;

import java.util.List;

import fr.adaming.dao.GerantDaoImpl;
import fr.adaming.dao.IGerantDao;
import fr.adaming.model.Conseiller;

public class ClassTest {

	public static void main(String[] args) {
		
		IGerantDao gerantDao = new GerantDaoImpl();
		Conseiller g = new Conseiller("Lecouty", "Alexandre");
		
		System.out.println("instanciation reussi");
		gerantDao.addConseiller(g);

		List<Conseiller> listeConseiller =gerantDao.getAllConseiller();
		
		System.out.println(listeConseiller);

	}

}

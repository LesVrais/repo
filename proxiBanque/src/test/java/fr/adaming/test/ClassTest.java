package fr.adaming.test;

import java.util.List;

import fr.adaming.dao.GerantDaoImpl;
import fr.adaming.dao.IGerantDao;
import fr.adaming.model.Conseiller;

public class ClassTest {

	public static void main(String[] args) {
		
		IGerantDao gerantDao = new GerantDaoImpl();
		Conseiller c = new Conseiller("Lecouty", "Alexandre");
		
		System.out.println("instanciation reussi");

		gerantDao.addConseiller(c);

	}

}

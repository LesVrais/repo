package fr.adaming.test;

import fr.adaming.dao.GerantDaoImpl;
import fr.adaming.dao.IGerantDao;
import fr.adaming.model.Conseiller;
import fr.adaming.service.GerantServiceImpl;
import fr.adaming.service.IGerantService;

public class ClassTest {

	public static void main(String[] args) {
		
		IGerantDao gerantService = new GerantDaoImpl();
		Conseiller c = new Conseiller("Lecouty", "Alexandre");
		
		System.out.println("instanciation reussi");

		gerantService.addConseiller(c);

	}

}

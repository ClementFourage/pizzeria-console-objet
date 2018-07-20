package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class SupprimerPizzaService extends MenuService {
	
	public void executeUC(Scanner scan, PizzaMemDao dao) {
		System.out.println("Suppression d’une pizza");
		System.out.println("Veuillez choisir le code de la pizza à surpprimer.");
		String supprcode = scan.next();
		
		dao.deletePizza(supprcode);
	}

}

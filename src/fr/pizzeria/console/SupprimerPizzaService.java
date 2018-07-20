package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;

public class SupprimerPizzaService extends MenuService {
	
	public void executeUC(Scanner scan, PizzaMemDao dao) {
		System.out.println("Suppression d’une pizza");
		System.out.println("Veuillez choisir le code de la pizza à surpprimer.");
		String supprcode = scan.next();
		
		dao.deletePizza(supprcode);
	}

}

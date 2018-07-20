package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {
	
	public void executeUC(Scanner scan, PizzaMemDao dao) {
		System.out.println("Mise à jour d’une pizza");
		System.out.println("Veuillez choisir le code de la pizza à modifier.");
		String codePizza = scan.next();
		System.out.println("Veuillez saisir le nouveau code");
		String nvCode = scan.next();
		System.out.println("Veuillez saisir le nouveau nom (sans espace) : ");
		String nvLibelle = scan.next();
		System.out.println("Veuillez saisir le nouveau prix : ");
		double nvPrix = scan.nextInt();
		
		dao.updatePizza(codePizza, new Pizza(nvCode, nvLibelle, nvPrix));
	}

}

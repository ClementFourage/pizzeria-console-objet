package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in) ;

		int choix = 0;

		//initialisation du tableau
		Pizza[] pizzas = new Pizza[10];
		pizzas[0] = new Pizza(0, "PEP", "Pépéroni", 12.5);
		pizzas[1] = new Pizza(1, "MAR", "Margherita", 14.0);
		pizzas[2] = new Pizza(2, "REIN", "La Reine", 11.5);
		pizzas[3] = new Pizza(3, "FRO", "La 4 fromages", 12.0);
		pizzas[4] = new Pizza(4, "CAN", "La cannibale", 12.5);
		pizzas[5] = new Pizza(5, "SAV", "La savoyarde", 13.0);
		pizzas[6] = new Pizza(6, "ORI", "L’orientale", 13.5);
		pizzas[7] = new Pizza(7, "IND", "L’indienne", 14.0);


		do {
			System.out.println("***** Pizzeria Administration ***** \n1. Lister les pizzas \n2. Ajouter une nouvelle pizza \n3. Mettre à jour une pizza \n4. Supprimer une pizza \n99. Sortir");

			choix = scanner.nextInt() ;

			switch (choix) {
			case 1 :
				System.out.println("Liste des pizzas" );

				for (int i = 0; i < pizzas.length; i++) {
					System.out.println(pizzas[i].getCode() + " -> " + pizzas[i].getLibelle() + " (" + pizzas[i].getPrix() + ")");
				}

				break;
			case 2 :
				System.out.println("Ajout d’une nouvelle pizza");

				System.out.println("Veuillez saisir le code :");
				String code = scanner.next();

				System.out.println("Veuillez saisir le libellé :");
				String libelle = scanner.next();

				System.out.println("Veuillez saisir le prix :");
				double prix = scanner.nextDouble();

				for (int i = 0; i < pizzas.length; i++) {
					if (pizzas[i] == null){
						pizzas[i] = new Pizza(0, code, libelle, prix);
						break;
					}
				}

			case 3 :
				System.out.println("Mise à jour d’une pizza");
				break;
			case 4 :
				System.out.println("Suppression d’une pizza");
				break;
			default :
				System.out.println("Aurevoir");
			}


		}	while (choix != 99);


	}

}
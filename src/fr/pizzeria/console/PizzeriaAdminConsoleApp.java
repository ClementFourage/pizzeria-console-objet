package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int choix = 0;

		PizzaMemDao dao = new PizzaMemDao();

		// Saisir un choix sur le menu principal
		do {
			System.out.println("***** Pizzeria Administration ***** \n 1. Lister les pizzas \n 2. Ajouter une nouvelle pizza \n 3. Mettre � jour une pizza \n 4. Supprimer une pizza \n 99. Sortir");
			choix = scan.nextInt();

			switch (choix) {

			//Affiche la liste sans les null
			case 1:
				ListerPizzasService lister = new ListerPizzasService();
				lister.executeUC(scan, dao);
				break;

				//Ajout d'une nouvelle pizza dans le tableau existant	
			case 2:
				AjouterPizzaService ajouter = new AjouterPizzaService();
				ajouter.executeUC(scan, dao);
				break;

				//Modification d'une pizza dans le tableau existant
			case 3:
				ModifierPizzaService modifier = new ModifierPizzaService();
				modifier.executeUC(scan, dao);
				break;

				//Supprimer une pizza
			case 4:
				SupprimerPizzaService supprimer = new SupprimerPizzaService();
				supprimer.executeUC(scan, dao);
				break;

			case 99:
				System.out.println("Aurevoir");
				break;


			default:
				System.out.println("Cette option de menu n'existe pas");
				break;


			}

		} while (choix != 99);
		
		scan.close();

	}

}
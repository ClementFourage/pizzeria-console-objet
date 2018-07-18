package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

			
		Scanner scanner = new Scanner(System.in) ;
		
		int choix = 0;
		
		do {
			System.out.println("***** Pizzeria Administration ***** \n1. Lister les pizzas \n2. Ajouter une nouvelle pizza \n3. Mettre à jour une pizza \n4. Supprimer une pizza \n99. Sortir");
			
			choix = scanner.nextInt() ;
			
			switch (choix) {
			case 1 :
				System.out.println("Liste des pizzas");
				break;
			case 2 :
				System.out.println("Ajout d’une nouvelle pizza");
				break;
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
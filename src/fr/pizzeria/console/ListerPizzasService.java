package fr.pizzeria.console;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasService extends MenuService {

	public void executeUC(Scanner scan, PizzaMemDao dao) {
		System.out.println("Liste des pizzas");
		
		List<Pizza> pizzas = dao.findAllPizzas();
		
		for (int i=0; i<pizzas.size();i++){
			if(pizzas!=null){
				System.out.println(pizzas.get(i).getCode()+" -> "+ pizzas.get(i).getLibelle()+" ( "+pizzas.get(i).getPrix()+" ) ");
			}
		}
		
	}

}

package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.Pizza;

public class PizzaMemDao implements IPizzaDao {
	
	private List<Pizza> pizzas;
	
	public PizzaMemDao() {
		pizzas = new ArrayList<>();
 		pizzas.add(new Pizza(0,"PEP","Pépéroni",12.50));
 		pizzas.add(new Pizza(1,"MAR","Margherita",14.00));
 		pizzas.add(new Pizza(2,"REIN","La Reine",11.50));
 		pizzas.add(new Pizza(3,"FRO","La 4 fromages",12.00));
 		pizzas.add(new Pizza(4,"CAN","La cannibale",12.50));
 		pizzas.add(new Pizza(5,"SAV","La savoyarde",13.00));
 		pizzas.add(new Pizza(6,"ORI","L'orientale",13.50));
 		pizzas.add(new Pizza(7,"IND","L'indienne",14.00));
	}

	@Override
	public List<Pizza> findAllPizzas() {
		return pizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		pizzas.add(pizza);
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		for (int i=0; i<pizzas.size();i++){					
			if((pizzas.get(i).code.equals(codePizza))){
				pizzas.set(i, pizza);
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		for (int i=0; i<pizzas.size();i++){
			if (pizzas.get(i).code.equals(codePizza)){
				pizzas.remove(i);
			}
		}
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		int result = 0;
		for(int i=0 ; i<pizzas.size(); i++){
			if(pizzas.get(i).getCode().equals(codePizza)){
				result=i;
				break;
			}
		}
		return pizzas.get(result);
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		return false;
	}

	
	
}

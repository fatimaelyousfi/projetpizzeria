package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class PizzaMemDao implements PizzaDao {

	/**
	 * creation d'une liste de pizzas
	 */
	private ArrayList<Pizza> pizzas;

	/**
	 * tableau des pizzas instancier
	 */
	public PizzaMemDao() {
		pizzas = new ArrayList<Pizza>();
		pizzas.add(new Pizza("PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE)); // affichage de l'enum CategoriePizza
																				// avec nomClasse.enum
		pizzas.add(new Pizza("MAR", "Margherita", 14.00, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("REIN", "La Reine", 11.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza("FRO", "La 4 fromages", 12.00, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("CAN", "La cannibale", 12.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza("SAV", "La savoyarde", 13.00, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("ORI", "L’orientale", 13.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza("IND", "L’indienne", 14.00, CategoriePizza.POISSON));
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
		pizzas.set(pizzas.indexOf(findPizzaByCode(codePizza)), pizza);

	}

	@Override
	public void deletePizza(String codePizza) {
		pizzas.remove(pizzas.indexOf(findPizzaByCode(codePizza)));
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		for (int i = 0; i < pizzas.size(); i++) {

			if (pizzas.get(i).getCode().equals(codePizza)) {
				return pizzas.get(i);
			}
		}
		return null;

	}

	@Override
	public boolean pizzaExists(String codePizza) {
		if (findPizzaByCode(codePizza) != null)
			return true;
		return false;
	}

}

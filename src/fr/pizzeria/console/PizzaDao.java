package fr.pizzeria.console;

import java.util.List;

import fr.pizzeria.model.Pizza;

/**
 * interface permettant de définir toute les méthodes.
 */
public interface PizzaDao {
	/**
	 * méthode qui permet de lister les pizzas
	 * 
	 * @return List<Pizza>
	 */
	List<Pizza> findAllPizzas();

	/**
	 * méthode qui permet de sauvegarder les pizzas
	 * 
	 * @param pizza
	 */
	void saveNewPizza(Pizza pizza);

	/**
	 * méthode qui permet de modifier les pizzas
	 * 
	 * @param codePizza
	 * @param pizza
	 */
	void updatePizza(String codePizza, Pizza pizza);

	/**
	 * méthode qui permet de supprimer les pizzas
	 * 
	 * @param codePizza
	 */
	void deletePizza(String codePizza);

	/**
	 * méthode qui permet de trouver une pizza selon son code
	 * 
	 * @param codePizza
	 * @return
	 */
	Pizza findPizzaByCode(String codePizza);

	/**
	 * méthode qui permet de definir les pizzas qui existent
	 * 
	 * @param codePizza
	 * @return true if existing
	 */
	boolean pizzaExists(String codePizza);
}

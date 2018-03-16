package fr.pizzeria.service;

import fr.pizzeria.console.PizzaDao;
import fr.pizzeria.console.PizzaMemDao;
import fr.pizzeria.exception.StockageException;

public abstract class MenuService {
	/**
	 * 
	 * Methode pour afficher le menu de la m�thode
	 * 
	 * @param pizzaDao
	 * @throws StockageException
	 */
	public abstract void executeUC(PizzaDao pizzaDao) throws StockageException; // throws permet au menu de gerer les
																					// exceptions d�finit dans
																					// StockageException.

}

package service.pizza;

import fr.pizzeria.console.PizzaMemDao;
import fr.pizzeria.exception.StockageException;

public abstract class MenuService {
	/**
	 * 
	 * Methode pour afficher le menu de la méthode
	 * 
	 * @param pizzaDao
	 * @throws StockageException
	 */
	public abstract void executeUC(PizzaMemDao pizzaDao) throws StockageException; // throws permet au menu de gerer les
																					// exceptions définit dans
																					// StockageException.

}

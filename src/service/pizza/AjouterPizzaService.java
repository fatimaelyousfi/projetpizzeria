package service.pizza;

import java.util.Scanner;

import fr.pizzeria.console.PizzaMemDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {

	Scanner sc = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemDao pizzaDao) throws SavePizzaException {

		System.out.println("Veuillez saisir un nouveaux code: "); // saissie du nouveaux code et s'il n'existe pas ->
																	// exception
		String newCode = sc.nextLine();
		if (newCode.isEmpty())
			throw new SavePizzaException("le code est vide");

		System.out.println("Veuillez choisir le nom (sans espace): "); // de m�me pour le nom
		String newNom = sc.nextLine();
		if (newNom.isEmpty())
			throw new SavePizzaException("le nom est vide");

		System.out.println("Veuillez saisir le prix "); // de m�m pour le prix
		String newPrix = sc.nextLine();
		if (newPrix.isEmpty())
			throw new SavePizzaException("le prix est vide");

		double prix1 = Double.parseDouble(newPrix); // de m�me pour la cat�gorie
		System.out.println("Veuillez saisir la cat�gorie");
		String cat = sc.nextLine();
		if (cat.isEmpty())
			throw new SavePizzaException("le categorie est vide");
		else if (CategoriePizza.valueOf(cat) != null)
			throw new SavePizzaException("la cat�gorie n'existe pas");

		CategoriePizza categoriePizza = CategoriePizza.valueOf(cat); // categoriePizza de type CategoriePizza re�oit la
																		// valeur de l'enum CategoriePizza

		pizzaDao.saveNewPizza(new Pizza(newCode, newNom, prix1, categoriePizza)); // sauvegarde de la nouvelle Pizza

	}

}

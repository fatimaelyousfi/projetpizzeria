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
		System.out.println("Veuillez saisir le code: ");
		String code1 = sc.nextLine();

		if (code1.isEmpty()) {
			throw new SavePizzaException("le code est vide");
		} else if (!pizzaDao.pizzaExists(code1)) {
			throw new SavePizzaException("la pizza n'existe pas");
		}

		System.out.println("Veuillez choisir le nom (sans espace): ");
		String nom1 = sc.nextLine();
		if (nom1.isEmpty())
			throw new SavePizzaException("le nom est vide");

		System.out.println("Veuillez saisir le prix ");
		String prix = sc.nextLine();
		if (prix.isEmpty())
			throw new SavePizzaException("le prix est vide");

		double prix1 = Double.parseDouble(prix);
		System.out.println("Veuillez saisir la catégorie");
		String cat = sc.nextLine();
		if (cat.isEmpty())
			throw new SavePizzaException("le cotegorie est vide");
		//

		CategoriePizza categoriePizza = CategoriePizza.valueOf(cat);

		pizzaDao.saveNewPizza(new Pizza(code1, nom1, prix1, categoriePizza));

	}

}

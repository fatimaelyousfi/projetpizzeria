package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.console.PizzaDao;
import fr.pizzeria.console.PizzaMemDao;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {

	Scanner sc = new Scanner(System.in);

	@Override
	public void executeUC(PizzaDao pizzaDao) throws UpdatePizzaException {
		System.out.println("Mises à jour d'une pizza");
		if (pizzaDao.findAllPizzas() == null)
			throw new UpdatePizzaException("la liste est null");
		for (int i = 0; i < pizzaDao.findAllPizzas().size(); i++) {
			if (pizzaDao.findAllPizzas() != null)
				System.out.println(pizzaDao.findAllPizzas().get(i));
		}
		System.out.println("Veuillez saisir le code de la pizza à modifier: ");
		String modifCode = sc.nextLine();
		if (modifCode.isEmpty()) {
			throw new UpdatePizzaException("le code est vide");
		} else if (!pizzaDao.pizzaExists(modifCode)) {
			throw new UpdatePizzaException("la pizza n'existe pas");
		}
		System.out.println("Vous avez saisie la pizza " + modifCode);

		System.out.println("Veuillez saisir le nouveaux code: ");
		String newCode = sc.nextLine();
		if (newCode.isEmpty())
			throw new UpdatePizzaException("le code est vide");

		System.out.println("Veuillez choisir le nouveaux nom (sans espace): ");
		String newNom = sc.nextLine();
		if (newNom.isEmpty())
			throw new UpdatePizzaException("le nom est vide");

		System.out.println("Veuillez saisir le nouveaux prix ");
		String newPrix = sc.nextLine();
		if (newPrix.isEmpty())
			throw new UpdatePizzaException("le prix est vide");

		double prix = Double.parseDouble(newPrix);
		System.out.println("Veuillez saisir la catégorie");
		String cat = sc.nextLine();
		if (cat.isEmpty())
			throw new UpdatePizzaException("le categorie est vide");
		else if (CategoriePizza.valueOf(cat) == null)
			throw new UpdatePizzaException("la catégorie n'existe pas");

		CategoriePizza categoriePizza = CategoriePizza.valueOf(cat);

		pizzaDao.updatePizza(modifCode, (new Pizza(newCode, newNom, prix, categoriePizza))); // creation de la nouvelle
																								// Pizza

	}

}

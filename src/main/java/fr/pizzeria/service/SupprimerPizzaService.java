package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.console.PizzaDao;
import fr.pizzeria.console.PizzaMemDao;
import fr.pizzeria.exception.DeletePizzaException;

public class SupprimerPizzaService extends MenuService {

	Scanner sc = new Scanner(System.in);

	@Override
	public void executeUC(PizzaDao pizzaDao) throws DeletePizzaException {
		System.out.println("Suppression d'une pizza");

		for (int i = 0; i < pizzaDao.findAllPizzas().size(); i++) {
			System.out.println(pizzaDao.findAllPizzas().get(i));
		}
		System.out.println("Veuillez saisir le code de la pizza à supprimer: ");
		String suppCode = sc.nextLine();
		if (suppCode.isEmpty()) {
			throw new DeletePizzaException("le code est vide");
		} else if (!pizzaDao.pizzaExists(suppCode)) {
			throw new DeletePizzaException("la pizza n'existe pas");
		}
		System.out.println("Vous avez choisie de supprimer la pizza " + suppCode);

		pizzaDao.deletePizza(suppCode);

	}

}

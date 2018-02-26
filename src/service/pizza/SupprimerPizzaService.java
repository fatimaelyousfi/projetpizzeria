package service.pizza;

import java.util.Scanner;

import fr.pizzeria.console.PizzaMemDao;

public class SupprimerPizzaService extends MenuService {

	Scanner sc = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemDao pizzaDao) {
		System.out.println("Suppression d'une pizza");

		for (int i = 0; i < pizzaDao.findAllPizzas().size(); i++) {
			System.out.println(pizzaDao.findAllPizzas().get(i));
		}
		System.out.println("Veuillez saisir le code de la pizza à supprimer: ");
		String suppCode = sc.nextLine();
		System.out.println("Vous avez choisie de supprimer la pizza " + suppCode);

		pizzaDao.deletePizza(suppCode);

	}

}

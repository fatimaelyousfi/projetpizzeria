package service.pizza;

import java.util.Scanner;

import fr.pizzeria.console.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {

	Scanner sc = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemDao pizzaDao) {
		System.out.println("Veuillez saisir le code: ");
		String code1 = sc.nextLine();
		System.out.println("Veuillez choisir le nom (sans espace): ");
		String nom1 = sc.nextLine();
		System.out.println("Veuillez saisir le prix ");
		String prix = sc.nextLine();
		double prix1 = Double.parseDouble(prix);

		pizzaDao.saveNewPizza(new Pizza(code1, nom1, prix1));

	}

}

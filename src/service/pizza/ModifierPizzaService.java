package service.pizza;

import java.util.Scanner;

import fr.pizzeria.console.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {

	Scanner sc = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemDao pizzaDao) {
		System.out.println("Mises à jour d'une pizza");
		for (int i = 0; i < pizzaDao.findAllPizzas().size(); i++) {
			if (pizzaDao.findAllPizzas() != null)
				System.out.println(pizzaDao.findAllPizzas().get(i));
		}
		System.out.println("Veuillez saisir le code de la pizza à modifier: ");
		String modifCode = sc.nextLine();
		System.out.println("Vous avez saisie la pizza " + modifCode);

		System.out.println("Veuillez saisir le nouveaux code: ");
		String newCode = sc.nextLine();
		System.out.println("Veuillez choisir le nouveaux nom (sans espace): ");
		String newNom = sc.nextLine();
		System.out.println("Veuillez saisir le nouveaux prix ");
		String newPrix = sc.nextLine();
		double prix = Double.parseDouble(newPrix);

		pizzaDao.updatePizza(modifCode, (new Pizza(newCode, newNom, prix)));

	}

}

package service.pizza;

import java.util.Scanner;

import fr.pizzeria.console.PizzaMemDao;

public class ListerPizzasService extends MenuService {

	Scanner sc = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemDao pizzaDao) {
		// TODO Auto-generated method stub
		System.out.println("Liste des pizzas");

		for (int i = 0; i < pizzaDao.findAllPizzas().size(); i++) {
			System.out.println(pizzaDao.findAllPizzas().get(i));
		}
	}

}

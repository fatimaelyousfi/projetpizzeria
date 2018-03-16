package fr.pizzeria.service;

public class MenuServiceFactory {

	public static MenuService renvoyerMenu(int choix) {
		if (choix == 1) {
			MenuService LS = new ListerPizzasService();
			return LS;
		}
		if (choix == 2) {
			MenuService AS = new AjouterPizzaService();
			return AS;
		}
		if (choix == 3) {
			MenuService MS = new ModifierPizzaService();
			return MS;
		}
		if (choix == 4) {
			MenuService SS = new SupprimerPizzaService();
			return SS;
		}
		if (choix == 99) {
			System.out.println("Aurevoir");
		}
		return null;
	}

}

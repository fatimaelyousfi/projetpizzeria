package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.exception.StockageException;
import service.pizza.MenuService;
import service.pizza.MenuServiceFactory;

/**
 * console possédent la méthode principal pour la création d'objet pizza
 *
 */

public class PizzeriaConsole {

	public static void main(String[] args) {

		PizzaMemDao dao = new PizzaMemDao();

		Scanner sc = new Scanner(System.in);
		int choix = 0;

		/**
		 * méthode permettant à l'utilisateur d'accéder à la méthode pour choisir,
		 * modifier, supprimer, et lister les pizzas
		 */
		while (choix <= 99) {
			if (choix != 99) {
				System.out.println("*****Pizzeria Administration*****"); // menu dans la boucle
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelles pizza");
				System.out.println("3. Mettre à jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. Sortir");
				System.out.println("chosir un menu");
				String piz1 = sc.nextLine();
				choix = Integer.parseInt(piz1);
				System.out.println("vous avez choisie le menu: " + choix);

				MenuService m = MenuServiceFactory.renvoyerMenu(choix); // m menu
				try {
					m.executeUC(dao);
				} catch (StockageException e) {
					System.out.println(e.getMessage());
				}
			}

			else {
			}

		}
	}
}

/*
 * de ligne 32 ListerPizzasService PS = new ListerPizzasService();
 * ModifierPizzaService MS = new ModifierPizzaService(); SupprimerPizzaService
 * SS = new SupprimerPizzaService(); AjouterPizzaService AS = new
 * AjouterPizzaService();
 * 
 * if (piz == 1) {
 * 
 * System.out.println("Liste des pizzas");
 * 
 * for (int i = 0; i < dao.findAllPizzas().size(); i++) {
 * System.out.println(dao.findAllPizzas().get(i)); }
 * 
 * PS.executeUC(dao); }
 * 
 * if (piz == 2) {
 * 
 * System.out.println("Veuillez saisir le code: "); //String code1 =
 * sc.nextLine(); System.out.println("Veuillez choisir le nom (sans espace): ");
 * String nom1 = sc.nextLine(); System.out.println("Veuillez saisir le prix ");
 * String prix = sc.nextLine(); double prix1 = Double.parseDouble(prix);
 * 
 * dao.saveNewPizza(new Pizza(code1, nom1, prix1));
 * 
 * AS.executeUC(dao); }
 * 
 * if (piz == 3) {
 * 
 * System.out.println("Mises à jour d'une pizza"); for (int i = 0; i <
 * dao.findAllPizzas().size(); i++) { if (dao.findAllPizzas() != null)
 * System.out.println(dao.findAllPizzas().get(i)); }
 * System.out.println("Veuillez saisir le code de la pizza à modifier: ");
 * String modifCode = sc.nextLine();
 * System.out.println("Vous avez saisie la pizza " + modifCode);
 * 
 * System.out.println("Veuillez saisir le nouveaux code: "); String newCode =
 * sc.nextLine();
 * System.out.println("Veuillez choisir le nouveaux nom (sans espace): ");
 * String newNom = sc.nextLine();
 * System.out.println("Veuillez saisir le nouveaux prix "); String newPrix =
 * sc.nextLine(); double prix = Double.parseDouble(newPrix);
 * 
 * dao.updatePizza(modifCode, (new Pizza(newCode, newNom, prix)));
 * 
 * MS.executeUC(dao);
 * 
 * } if (piz == 4) {
 * 
 * System.out.println("Suppression d'une pizza");
 * 
 * for (int i = 0; i < dao.findAllPizzas().size(); i++) {
 * System.out.println(dao.findAllPizzas().get(i)); }
 * System.out.println("Veuillez saisir le code de la pizza à supprimer: ");
 * String suppCode = sc.nextLine();
 * System.out.println("Vous avez choisie de supprimer la pizza " + suppCode);
 * 
 * dao.deletePizza(suppCode);
 * 
 * SS.executeUC(dao); }
 * 
 * }
 */

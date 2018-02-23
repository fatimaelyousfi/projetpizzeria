package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Pizza[] p = new Pizza[100]; // je creer un tableau
		p[0] = new Pizza("PEP", "Pépéroni", 12.50);
		p[1] = new Pizza("MAR", "Margherita", 14.00);
		p[2] = new Pizza("REIN", "La Reine", 11.50);
		p[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		p[4] = new Pizza("CAN", "La cannibale", 12.50);
		p[5] = new Pizza("SAV", "La savoyarde", 13.00);
		p[6] = new Pizza("ORI", "L’orientale", 13.50);
		p[7] = new Pizza("IND", "L’indienne", 14.00);

		Scanner sc = new Scanner(System.in);
		int piz = 0;
		while (piz != 99) {
			System.out.println("*****Pizzeria Administration*****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelles pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			System.out.println("chosir un menu");
			String piz1 = sc.nextLine();
			piz = Integer.parseInt(piz1);
			System.out.println("vous avez choisie le menu: " + piz);
			if (piz == 1) {
				System.out.println("Liste des pizzas");

				for (int i = 0; i < p.length; i++) {
					if (p[i] != null)
						System.out.println(p[i]);
				}
			}

			if (piz == 2) {
				System.out.println("Veuillez saisir le code: ");
				String code1 = sc.nextLine();
				System.out.println("Veuillez choisir le nom (sans espace): ");
				String nom1 = sc.nextLine();
				System.out.println("Veuillez saisir le prix ");
				String prix = sc.nextLine();
				double prix1 = Double.parseDouble(prix);

				Pizza p1 = new Pizza(code1, nom1, prix1);

				for (int i = 0; i < p.length; i++) {
					if (p[i] == null) {
						p[i] = p1;
						break;
					}
				}
			}

			if (piz == 3) {
				System.out.println("Mises à jour d'une pizza");
				for (int i = 0; i < p.length; i++) {
					if (p[i] != null)
						System.out.println(p[i]);
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

				for (int i = 0; i < p.length; i++) {
					if (p[i].getCode().equals(modifCode)) {
						p[i].setCode(newCode);
						p[i].setPrix(prix);
						p[i].setLibelle(newNom);
						break;
					}
				}

			}
			if (piz == 4) {
				System.out.println("Suppression d'une pizza");

				for (int i = 0; i < p.length; i++) {
					if (p[i] != null)
						System.out.println(p[i]);
				}
				System.out.println("Veuillez saisir le code de la pizza à supprimer: ");
				String suppCode = sc.nextLine();
				System.out.println("Vous avez choisie de supprimer la pizza " + suppCode);

				for (int i = 0; i < p.length; i++) {
					if (p[i].getCode().equals(suppCode)) {
						p[i] = null;
						break;
					}
				}

			}
			if (piz == 99) {
				System.out.println("Aurevoir");
			}

		}
	}

	private static ArrayList<String> toArrayList(Pizza[] p) {
		// TODO Auto-generated method stub
		return null;
	}
}

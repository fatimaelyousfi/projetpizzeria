package fr.pizzeria.utils;

import java.lang.reflect.Field;

import fr.pizzeria.console.PizzaDao;

public class StringUtils {

	public String getStringValue(PizzaDao pizza) {

		String chaine = "";
		try {
			Field[] fields = pizza.getClass().getDeclaredFields();
			for (Field f : fields) {
				f.setAccessible(true);
				if (f.isAnnotationPresent(ToString.class)) {
					ToString annotation = f.getAnnotation(ToString.class);
					Object value = f.get(pizza);
					chaine += value;
				}

			}
			return chaine;
		} catch (Exception e) {
			return null;
		}
	}

}
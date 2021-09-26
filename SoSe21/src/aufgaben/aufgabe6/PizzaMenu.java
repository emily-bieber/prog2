package aufgaben.aufgabe6;

import java.util.*;

public class PizzaMenu 
{
	public static boolean existingPizza(Map<String, Double> menu, String pizza)
	{
		if (menu.containsKey(pizza))
		{
			return true;
		}
		return false;
	}
	
	public static void printPrice(Map<String, Double> menu, String pizza)
	{
		if (existingPizza(menu, pizza))
		{
			System.out.printf("%10s : %.2f \u20ac %n", pizza, menu.get(pizza));
		}
		else
		{
			System.out.printf("%10s : Diese Pizza gibt es nicht. %n", pizza);
		}
	}
	
	public static void printMenu(Map<String, Double> menu)
	{
		System.out.printf("%n----------------------------------%n%n");
		if (menu.isEmpty() || menu.size() > 1)
		{
			System.out.printf("Das Menu enthaelt %d Pizzen. %n", menu.size());
		}
		else
		{
			System.out.printf("Das Menu enthaelt eine Pizza. %n");
		}
		if (menu.isEmpty())
		{
			System.out.printf("%n----------------------------------%n");
		}	
		else
		{
			for (Map.Entry<String, Double> pizza : menu.entrySet())
			{
				System.out.printf("%12s : %.2f \u20ac %n", pizza.getKey(), pizza.getValue());
			}
			System.out.printf("%n----------------------------------%n");
		}
	}
	
	public static void affordablePizza(Map<String, Double> menu, double maxPrice)
	{
		System.out.printf("Eingegebener Betrag : %.2f \u20ac %n", maxPrice);
		Set<String> pizzaNamen = new HashSet<>();
		for (Map.Entry<String, Double> pizza : menu.entrySet())
		{
			if (pizza.getValue() <= maxPrice)
			{
				pizzaNamen.add(pizza.getKey());
			}
		}
		
		if (pizzaNamen.isEmpty())
		{
			System.out.println("Leider gibt es zu diesem Preis keine Pizza.");
		}
		else
		{
			System.out.println("Moegliche Pizzen : " + pizzaNamen);
		}
	}

	public static void main(String[] args) 
	{
		Map<String, Double> menu = new HashMap<>();
		menu.put("Margherita", 7.0);
		menu.put("Veggie", 7.5);
		menu.put("Salami", 8.5);
		menu.put("Schinken", 8.5);
		
		printPrice(menu, "Margherita");
		printPrice(menu, "Salami");
		printPrice(menu, "Hawaii");
		
		printMenu(menu);
		System.out.println();
		
		menu.put("Schinken", 8.2);
		System.out.printf("Schninken mit anderem Preis : %n");
		printMenu(menu);
		System.out.println();
		
		affordablePizza(menu, 5.0);
		System.out.println();
		affordablePizza(menu, 8.0);
		System.out.println();
		affordablePizza(menu, 8.7);
		System.out.println();

		menu.clear();
		menu.put("Verde", 7.0);
		menu.put("Hawaii", 8.2);
		menu.put("Tradizionale", 8.5);
		
		System.out.println("Neues Menu!");
		printMenu(menu);
		System.out.println();
		
		Map<String, Double> menu2 = new HashMap<>();
		menu2.putAll(menu);
		menu2.remove("Hawaii");
		
		System.out.println("Menu 2");
		printMenu(menu2);
		
	}

}

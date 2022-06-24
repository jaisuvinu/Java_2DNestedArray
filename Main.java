package java01;

import java.util.ArrayList;

public class Main{
	

	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Donuts");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Pasta");		

		ArrayList<String> produceList = new ArrayList();
		produceList.add("Tomato");
		produceList.add("Carrot");
		produceList.add("Peppers");
				
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("Soda");
		drinksList.add("Lemonade");
		drinksList.add("MilkShake");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(2).get(1));
		
				
		
	}
		
     		
	
}
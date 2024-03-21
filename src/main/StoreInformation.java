package main;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StoreInformation {
	
	ValidateUser valid;
	Scanner sc;
	int nooffood;
	
	public static Map<Integer, Food> order;
	
	public static ArrayList<Food> menu;
	
	public StoreInformation() 
	{
		sc = new Scanner(System.in);
		Food grilledChicken = new Food("grilled chicken", 50.0);
		Food friedChicken = new Food("fried chicken", 50.0);
		
		Food steak = new Food("steak", 35.0);
		Food broccoli = new Food("broccoli", 35.0);
		Food spinach = new Food("spinach", 35.0);
		
		Food soda = new Food("soda", 25.0);
		Food grilledSalmon = new Food("grilled salmon", 25.0);
		
		Food salad = new Food("salad", 20.0);
		Food mashedPotatoes = new Food("mashed potatoes", 25.75);
		
		menu = new ArrayList<Food>();
		
		menu.add(grilledChicken);
		menu.add(friedChicken);
		menu.add(steak);
		menu.add(broccoli);
		menu.add(spinach);
		menu.add(soda);
		menu.add(grilledSalmon);
		menu.add(salad);
		menu.add(mashedPotatoes);
		
//		listOffoods = new ArrayList<>();
//        
//		listOffoods.add(greetingCard);
//        listOffoods.add(birthdayCard);
//        listOffoods.add(deodorant);
//        listOffoods.add(toothbrush);
//        listOffoods.add(toothpaste);
//        listOffoods.add(milk);
//        listOffoods.add(eggs);
//        listOffoods.add(broccoli);
//        listOffoods.add(carrots);
		
	}
	
//	public User registerNewUser() {
//		
//	    System.out.println("OK, great, you want to register as a new user."); 
//	    System.out.println("------------------------------"); 
//	    System.out.println();
//	    
//	    	System.out.println("Please enter your first name: ");
//	    	String firstName = sc.next();
//	    	System.out.println("Please enter your last name: ");
//	    	String lastName = sc.next();
//	    	System.out.println("Please enter your email: ");
//	    	String emailId = sc.next();
//	    	System.out.println("Please enter your username, it must begin with a letter, then have "
//	    			+ "any combination of letters and numbers, and be at least 7 characters: ");
//	    	
//	    	String username = sc.next();
//	    	while(!username.matches("^[a-zA-Z][a-zA-Z0-9]{6,}$"))
//	    	{
//	    		System.out.println("Sorry, that didn't meet the requirements, please try again!!");
//	    		System.out.println("Please enter your username:  ");
//	    		username = sc.next();
//	    	}
//	    	
//	    	System.out.println("Password requirements are same as username requirements: ");
//	    	String password = sc.next();
//	    	while(!password.matches("^[a-zA-Z][a-zA-Z0-9]{6,}$"))
//	    	{
//	    		System.out.println("Sorry, that didn't meet the requirements, please try again!!");
//	    		System.out.println("Please enter your password:  ");
//	    		password = sc.next();
//	    	}
//	    	
//	    	System.out.println("Thank you " + firstName + " " + lastName + ".  Your username is '" + username + "' and your password is '" + password + "'.");
//	    
//	    	User user = new User(firstName, lastName, username, emailId, password);
//	    	MainStore.users.add(user);
//	    	return user;
//	    
//	}
	
	//This method can be used to insert our own records in array
//		public Map<Integer,food> adminStoreData()
//		{
//			System.out.println("How many foods do you want to store");
//			nooffood = sc.nextInt();
//			System.out.println("coming in to store the data method");
//				for(int x = 1;x < nooffood;x++)
//				{
//				food p1 = new food();
//				System.out.println("Enter food id ");
//				int foodid=sc.nextInt();
//				p1.setfoodid(foodid);
//				System.out.println("Enter food name ");
//				p1.setfoodname(sc.next());
//				System.out.println("Enter Available Quantity ");
//				p1.setAvailableQuantity(sc.nextInt());
//				System.out.println("Enter Category");
//				p1.setCategory(sc.next());
//				System.out.println("Enter Buying price ");
//				p1.setBuyingPrice(sc.nextDouble());
//				foodMap.put(foodid,p1);
//			}
//			return foodMap;
//		}
	
//	public void adminDisplayAllfoods()
//	{
//		
//		Set<Map.Entry<Integer,food>> mapset=foodMap.entrySet();
//		System.out.println("Displaying All foods ");
//		for(Map.Entry<Integer,food> p1:mapset)
//		{
//			food pprd=p1.getValue();
//			System.out.println("food name is " + pprd.getfoodname());
//			System.out.println("food Quantity is " + pprd.getAvailableQuantity());
//			System.out.println("Buying price is " + pprd.getSellingPrice());
//			
//		}
//	}
	
	public void viewMenu()
	{
				System.out.println("Ok, great, here is out current menu: ");
				
				System.out.println("Option\t\t\t\tPrice");
				System.out.println("--------------------------");
				
				for(Food food : menu)
				{
					String formattedPrice = String.format("%.2f", food.getPrice());
					System.out.printf("%-32s%-10s%n", food.getFoodName(), formattedPrice);
				}
				
				System.out.println();
				System.out.println();
				
	        
//				listOffoods.stream()
//	                .filter(food -> finalCategoryName.equals(food.getCategory()))
//	                .forEach(food -> System.out.println("food: " + food.getfoodname() + ", Price: "
//	                        + food.getSellingPrice() + ", Quantity: " + food.getAvailableQuantity()));
			
	}
	
	public void selectItem()
	{
		Map<Integer, Food> choiceMap = new HashMap<Integer, Food>();
		
		System.out.println("Ok, great, what would you like to select: ");
		System.out.println();
		System.out.println("   Option\t\t\t\tPrice");
		System.out.println("--------------------------");
		
		int counter = 1;
		
		for(Food food : menu)
		{
			String formattedPrice = String.format("%.2f", food.getPrice());
			System.out.printf("%d. %-37s%-10s%n", counter++, food.getFoodName(), formattedPrice);
			choiceMap.put(counter, food);
		}
		
		System.out.println();
		System.out.println();
		
	}
	
//	public void adminListfoods()
//	{
//		for(Map.Entry<Integer, food> entry : foodMap.entrySet())
//		{
//		    food food = entry.getValue();
//			
//			System.out.println("food Name: " + food.getfoodname());
//			System.out.println("food Quantity: " + food.getAvailableQuantity());
//			System.out.println("food Price: " + food.getBuyingPrice());
//			System.out.println("--------------------------");
//			System.out.println("--------------------------");
//		}
//	}
//	
//	public void adminSearchById() 
//	{		
//		System.out.println("Admin - Search By food ID: ");
//		System.out.println("----------------------------");
//		System.out.print("Please enter the food ID you want to search for: ");
//		int foodID = sc.nextInt();
//		
//		food foundfood = foodMap.get(foodID);
//		
//		if (foundfood != null) {
//			System.out.println();
//			System.out.println("----------------------------");
//			System.out.println("Result: ");
//	        System.out.println("food ID: " + foundfood.getfoodid());
//	        System.out.println("food Name: " + foundfood.getfoodname());
//	        System.out.println("Selling Price: " + foundfood.getSellingPrice());
//	        System.out.println("Available Quantity: " + foundfood.getAvailableQuantity());
//	        System.out.println("");
//	        System.out.println();
//	    } else {
//	    	System.out.println();
//			System.out.println("----------------------------");
//			System.out.println("Result: ");
//	        System.out.println("food with ID " + foodID + " not found.");
//	        System.out.println("");
//	        System.out.println();
//	    }
//	}
//	
//	public void adminListfoodsByCategory()
//	{
//		int choice;
//		boolean looping = true;
//		
//		System.out.println();
//		System.out.println("Admin - List foods By Category: ");
//		System.out.println("----------------------------");
//		
//		
//		while(looping) {
//			
//			System.out.println();
//			System.out.println("------------------------");
//			System.out.println("Please enter the Category you want to list the foods in: ");
//			System.out.println("1. Grocery ");
//			System.out.println("2. Stationary ");
//			System.out.println("3. Toiletries ");
//			System.out.println("4. Vegetables ");
//			System.out.println("5. Last menu ");
//			choice = sc.nextInt();
//			
//			String categoryName = "";
//			
//	        switch (choice) {
//	            case 1:
//	                categoryName = "Groceries";
//	                break;
//	            case 2:
//	                categoryName = "Stationary";
//	                break;
//	            case 3:
//	                categoryName = "Toiletries";
//	                break;
//	            case 4:
//	                categoryName = "Vegetables";
//	                break;
//	            case 5:
//	            	looping = false;
//	            	break;
//	            default:
//	            	System.out.println("Invalid selection, please try again!!");
//	            	continue;
//	        }
//
//	        final String finalCategoryName = categoryName;
//	        
//	        System.out.println();
//	        System.out.println("Category: " + finalCategoryName);
//	        System.out.println("------------------------");
//	        
//	        listOffoods.stream()
//	                .filter(food -> finalCategoryName.equals(food.getCategory()))
//	                .forEach(food -> System.out.println("food: " + food.getfoodname() + ", Price: "
//	                        + food.getSellingPrice() + ", Quantity: " + food.getAvailableQuantity()));
//	        
//		}
//	}
//	
//	public void adminSearchfoodsByName()
//	{
//		boolean looping = true;
//		
//		System.out.println();
//		System.out.println("Admin - Search foods By Name: ");
//		System.out.println("----------------------------");
//		
//		while(looping) {
//			
//			System.out.println();
//			System.out.println("------------------------");
//			System.out.println("Please enter the food you want to see details for: ");
//			
//			final String choice = sc.next();
//	        
//	        foodMap.values().stream()
//	        .filter(food -> food.getfoodname().equalsIgnoreCase(choice))
//	        .forEach(food -> {
//	        	System.out.println("food ID: " + food.getfoodid());
//                System.out.println("food Name: " + food.getfoodname());
//                System.out.println("Selling Price: " + food.getSellingPrice());
//                System.out.println("Available Quantity: " + food.getAvailableQuantity());
//	        });
//	        
//	        System.out.println();
//	        System.out.println("Do you want to search for another food? (yes/no)");
//	        String response = sc.next();
//	        if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
//	            looping = false;
//	        }
//		}
//	}
//	
//	public void adminCalculateProfit() 
//	{
//		
//		System.out.println("Enter category for which you want to see profit: ");
//		System.out.println();
//		String category = sc.next();
//		double profit = 0;
//		Set<Map.Entry<Integer,food>> mapset = foodMap.entrySet();
//		
//		for(Map.Entry<Integer,food> p1 : mapset)
//		{
//			food fooddetail = p1.getValue();
//			if(fooddetail.getCategory().equals(category))
//			{
//				profit = fooddetail.getSellingPrice() - fooddetail.getBuyingPrice();
//			}
//		
//			
//		}
//		System.out.println("Profit is " + profit);
//		System.out.println("----------------");
//		System.out.println();
//		
//	}
//	
//	public void adminTotalAmountOnfood()
//	{
//		double totalamount=0;
//	
//		Set<Map.Entry<Integer,food>> mapset = foodMap.entrySet();
//		for(Map.Entry<Integer,food> p1:mapset)
//		{
//			food fooddetail = p1.getValue();
//			totalamount = totalamount+(fooddetail.getBuyingPrice()*fooddetail.getAvailableQuantity());
//			
//		}
//		System.out.println("Total Amount Spent On food " + totalamount);
//		System.out.println("----------------");
//		System.out.println();
//		
//	}
	
//	public void adminMenu()
//	{
//		
//		int option;
//		boolean looping = true;
//		
//		clearConsole();
//		System.out.println(String.format("Welcome admin, what would you like to do today?"));
//		//System.out.println("Welcome " + name + "!!  What would you like to do today?");
//		
//		while(looping)
//		{
//			System.out.println("1. Admin - List foods ");
//			System.out.println("2. Admin - Search By food ID ");
//			System.out.println("3. Admin - List foods By Category ");
//			System.out.println("4. Admin - Search foods By Name ");
//			System.out.println("5. Exit");
//			
//			option = sc.nextInt();
//			
//			switch(option)
//			{
//				case 1:
//					adminListfoods();
//					break;
//				case 2:
//					adminSearchById();
//					break;
//				case 3:
//					adminListfoodsByCategory();
//					break;
//				case 4:
//					adminSearchfoodsByName();
//					break;
//				case 5:
//					System.out.println("Thank you....bye!!");
//					looping = false;
//					break;
//				default:
//					System.out.println("Invalid selection, please try again!!");
//					continue;
//			}
//		}
//	}
}

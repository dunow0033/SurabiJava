package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidateUser {
	
	private Scanner sc;
	private List<User> users;
	MainStore store;
	StoreInformation storeinfo;
	
	public ValidateUser()
	{
		sc = new Scanner(System.in);
		storeinfo = new StoreInformation();
		
		users = new ArrayList<User>();
		
		User user = new User("eddie", "johnson", "eddiej123", "eddie@hotmail.com", "eddiej123");
		User dan = new User("dan", "connor", "danc123", "dan@hotmail.com", "danc123");
		User brad = new User("brad", "thomas", "brad123", "brad@hotmail.com", "brad123");
		User tom = new User("tom", "bradley", "tomb123", "tom@hotmail.com", "tomb123");
		User henry = new User("henry", "jones", "henry123", "henry@hotmail.com", "henry123");
		User admin = new User("admin", "admin", "admin", "admin@hotmail.com", "admin");
		
		users.add(user);
		users.add(dan);
		users.add(brad);
		users.add(tom);
		users.add(henry);
		users.add(admin);
	}
	
//	public void checkAdmin(String username, String password)
//	{
//		if(username.equals("admin") && password.equals("admin"))
//		{
//			adminMenu();
//		}
//	}
	
//	public void adminMenu()
//	{
//		String choice="y";
//		while(!choice.equals("n"))
//		{
//			System.out.println("1. Insert Product");
//			System.out.println("2. Display All Products");
//			System.out.println("3. Display Product By Category");
//			System.out.println("4. Display Product by Name");
//			System.out.println("5. Search Product by Id ");
//			System.out.println("6. Display Profit ");
//			System.out.println("7. Total Product cost");
//			System.out.println("8. Exit ");
//			System.out.println("-------------------");
//			System.out.println();
//			
//			int ch=sc.nextInt();
//			
//			switch(ch)
//			{
//				case 1:
//					storeinfo.adminStoreData();
//					break;
//				case 2:
//					storeinfo.adminListProducts();
//					break;
//				case 3:
//					storeinfo.adminListProductsByCategory();
//					break;
//				case 4:
//					storeinfo.adminSearchProductsByName();
//					break;
//				case 5:
//					storeinfo.adminSearchById();
//					break;
//				case 6:	
//					storeinfo.adminCalculateProfit();
//					break;
//				case 7:
//					storeinfo.adminTotalAmountOnProduct();
//					break;
//				case 8:
//					System.out.println("Thank you!!  Bye!!");
//					System.exit(0);
//					break;
//				default:
//					System.out.println("Invalid selection, please try again!!");
//					continue;
//		}
//		
//	}
//		System.out.println("Enter choice for menu");
//		choice = sc.next();
//	}
	
	public void checkUser(String username, String pwd) throws InvalidUserException
	{
		
			for(User u : users)
			{
				if(u.getUsername().equals(username) && u.getPassword().equals(pwd))
				{
					userMenu(u.getFirstName());
				}
			}
			throw new InvalidUserException();
			
	}
	
	public void userMenu(String name)
	{
		int option;
		boolean looping = true;
		
		System.out.println(String.format("Welcome %s, what would you like to do today?", name));
		
		while(looping)
		{
			System.out.println("1. View Menu ");
			System.out.println("2. Select an Item ");
			System.out.println("3. Exit");
			
			option = sc.nextInt();
			
			switch(option)
			{
				case 1:
					storeinfo.viewMenu();
					break;
				case 2:
					storeinfo.selectItem();
					break;
				case 3:
					System.out.println("Thank you....bye!!");
					looping = false;
					System.exit(0);
					break;
				default:
					System.out.println("Invalid selection, please try again!!");
					continue;
			}
		}
	}
	
	public void register()
	{
		User userd = new User();
		
		String username, password, email;
		
		System.out.println("Enter username, must begin with letter, followed by any 5 letters or digits:  ");
		username = sc.next();
		
		while(!username.matches("^[a-zA-Z][a-zA-Z0-9]{6,}$")) {
			System.out.println("Invalid Username!!  Please try again:");
			username = sc.next();
		}
		
		userd.setUsername(username);
		
		System.out.println("Enter Password, must begin with letter, followed by any 5 letters or digits:  ");
		password = sc.next();
		
		while(!password.matches("^[a-zA-Z][a-zA-Z0-9]{6,}$")) {
			System.out.println("Invalid password!!  Please try again:");
			password = sc.next();
		}
		
		userd.setPassword(password);
		
		System.out.println("Enter Email ");
		email = sc.next();
		
		while(!email.matches("^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$")) {
			System.out.println("Invalid email!!  Please try again:");
			email = sc.next();
		}
		
		userd.setEmail(email);
		
		users.add(userd);
	}
}

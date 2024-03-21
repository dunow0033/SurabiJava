package main;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;


public class MainStore {
	
	private static Scanner sc;
	static ValidateUser valid;
	private static String user;
	private static String pass;
	public static ArrayList<User> users;

	public MainStore() {
		
		valid = new ValidateUser();
	}

	public static void main(String args[])
	{
		MainStore ms = new MainStore();
		sc = new Scanner(System.in);
		System.out.println("----------------");
		System.out.println("Welcome to Surabi!!");
		System.out.println("----------------");
		//System.out.println("1. Login As Admin");
		System.out.println("1. Login As User");
		System.out.println("2. Register as New User");
		System.out.println("3. Exit");
		System.out.print("Please make a selection:  ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
//			case 1:
//				System.out.println("Admin, Please enter your username: ");
//				user = sc.next();
//				
//				System.out.println("Admin, Please enter your password: ");
//				pass = sc.next();
//					
//				//valid.checkAdmin(user, pass);
//				break;
				
			case 1:
				System.out.println("User, please enter your username: ");
				String user = sc.next();
				while(!user.matches("^[a-zA-Z][a-zA-Z0-9]{6,}$")) {
					System.out.println("Invalid Username!!  Please try again:");
					user = sc.next();
				}
				
				System.out.println("User, please enter your password: ");
				String pass = sc.next();
				while(!pass.matches("^[a-zA-Z][a-zA-Z0-9]{6,}$")) {
					System.out.println("Invalid Password!!  Please try again:");
					pass = sc.next();
				}
				try {
					valid.checkUser(user, pass);
				} catch(InvalidUserException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				valid.register();
				break;
			case 3:
				System.out.println("Thank you for your time!!  Bye!!");
				System.exit(0);
				break;
		}	
	}
}

package com.java.class05;

public class LoginFunctionality {
	public static void main(String[] args) {
		String dbUsername = "chirag";
		String dbPassword = "test@123";
		
		String username = "chirag";
		String password = "test@123";
		
		
		if(dbUsername == username && dbPassword == password) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login unsuccessful");
		}
		
	
	}
}

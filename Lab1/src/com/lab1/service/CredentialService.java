package com.lab1.service;

import java.util.Random;

import com.lab1.model.Employee;

public class CredentialService {
	String emailAddress;
	char[] password = new char[10];;
	String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialChars = "!@#$%^&*?";
	String allowedChars = upperCase + lowerCase + numbers + specialChars;
	
	public char[] generatePassword() {
		Random rand = new Random();
		for(int i=0;i<10;i++) {
			password[i] = allowedChars.charAt(rand.nextInt(allowedChars.length()));
		}
		return password;
	}
	
	public String generateEmailAddress(Employee employee, String department) {
		String firstName = employee.getFirstName().toLowerCase();
		String lastName = employee.getLastName().toLowerCase();
		emailAddress = firstName + lastName + "@" + department + ".abc.com";
		return emailAddress;
		
	}
	
	public void showCredentials(Employee employee, char[] pass, String email) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    ---> "+ email);
		System.out.println("Password ---> "+ String.valueOf(pass));
	}
}

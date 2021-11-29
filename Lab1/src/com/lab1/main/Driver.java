package com.lab1.main;

import java.util.Scanner;

import com.lab1.model.Employee;
import com.lab1.service.CredentialService;

public class Driver {
	public static void main(String args[]) {
		Employee emp = new Employee ("Bhavya", "Madan");
		CredentialService cs = new CredentialService();
		String empEmail;
		char[] empPass;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		int dept = 0;	
		Scanner sc = new Scanner(System.in);
		// Check that only integer value is entered by the user.
		if(sc.hasNextInt()) {
			dept = sc.nextInt();
		} else {
			System.out.println("Please enter the index for the department you want to select.");
			System.exit(0);
		}
		switch(dept) {
		case 1:
			empEmail = cs.generateEmailAddress(emp, "tech");
			empPass = cs.generatePassword();
			cs.showCredentials(emp, empPass, empEmail);
			break;
		case 2:
			empEmail = cs.generateEmailAddress(emp, "adm");
			empPass = cs.generatePassword();
			cs.showCredentials(emp, empPass, empEmail);
			break;
		case 3:
			empEmail = cs.generateEmailAddress(emp, "hr");
			empPass = cs.generatePassword();
			cs.showCredentials(emp, empPass, empEmail);
			break;
		case 4:
			empEmail = cs.generateEmailAddress(emp, "lg");
			empPass = cs.generatePassword();
			cs.showCredentials(emp, empPass, empEmail);
			break;
		default:
			System.out.println("Invalid Input !!!");
		}
		sc.close();
	}
}

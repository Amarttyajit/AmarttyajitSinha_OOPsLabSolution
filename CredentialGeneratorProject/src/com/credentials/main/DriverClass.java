package com.credentials.main;
import com.credentials.model.Employee;
import com.credential.service.Credentials;
import java.util.Scanner;
public class DriverClass {
		
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter you First name");
		String fname=sc.nextLine();
		System.out.println("enter you Last name");
		String lname=sc.nextLine();
		Employee e=new Employee(fname,lname);
		Credentials c= new Credentials();
		
		System.out.println("Please enter the department fromthe following");
		System.out.println("1. Technical\n 2. Admin\n 3.Human Resource\n 4.Legal");
		
		int op=sc.nextInt();
		switch(op) {
		case 1: c.showCredentials(e,"tech");
		break;
		case 2: c.showCredentials(e,"admin");
		break;
		case 3: c.showCredentials(e,"HR");
		break;
		case 4: c.showCredentials(e,"legal");
		break;
		default: System.out.println("Invalid Department");
		break;
		}
		
	}

}

package com.credential.service;
import com.credentials.model.Employee;
import java.util.Random;
public class Credentials {
	
	private String generatePassword()
	{   Random r = new Random();

    String password = "";
    for (int i = 0; i <= 7; i++) {
        password += (char)(r.nextInt(123-33)+33);
    }
    return password;
}
	private  String generateEmailAddress(Employee e, String department) {
 return e.getFirstName()+e.getLastName()+"@"+department+"abc.com";
}
 public void showCredentials(Employee e, String department )
 {
	 System.out.println("Dear " + e.getFirstName() + "your generated credentials are as follows:");
	
	System.out.println("Email ----> "+this.generateEmailAddress(e, department));
	 System.out.println( "Password ----> "+this.generatePassword());
 } 
 }
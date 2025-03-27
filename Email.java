package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultpassword = 8;
	private String email;
	private String companySuffix= "ayecompany.com";
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	
	// Constructor to receive the first name and last name
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// call a method for asking department return the department
		this.department = setDepartment(); 
		//System.out.println("Department: " + this.department);
		
		// call a method for asking password return the password
		this.password = randomPassword(defaultpassword);
		System.out.println("Your password is: " + this.password);
		
		
		//combine elements to generate the email
		email = firstName.toLowerCase() +"." + lastName.toLowerCase() + "@" + department + companySuffix ;
		//System.out.println("Your Email is : " + email );
	    
	}
	
	// Ask for the department 
	public String setDepartment() {
		System.out.println("New Worker: " + firstName + " Department Codes: \n1 for Sales \n2 for Development \n3 Accouting \n0 for none\nEnter the department code:");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) {return "sales";}
		else if(deptChoice == 2) {return "dev";}
		else if(deptChoice == 3) {return "acc";}
		else {return "";}

}
	
	
	//  Generate a random password 
	public String randomPassword(int length) {
		String passwordSet = "asdfghjklzxcvbnmqwertyuiop1234567890@#%$";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random()*password.length);
			password[i] = passwordSet.charAt(i);
			
		}
		return new String(password);
		
	}
	
	
	// set the mailBox
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	
	// set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change password
	public void changePassword(String change) {
		this.password = change;
	}
	
	
	// get the mailBox
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	
		
	// get alternate email
	public String getAlternateEmail() {return alternateEmail;}

		
	// change password
	public String getChangePassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + "" + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOXCAPACITY: " + mailBoxCapacity + "mb";
	}
	
}

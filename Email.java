package com;
import java.util.Scanner;

public class Email {
	
	
	private String FirstName;
	private String LastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "aeycompany.com";
	
	
	// Constructor to receive the first name and last name
	
	public Email(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	    System.out.println("New Worker: " + this.FirstName +" " + this.LastName );
	    
	    // Call a method asking for the department - return department
	    
	    this.department = setDepartment();
//	    System.out.println("Department: " + this.department);
	    
	    //Call a method that returns a random password
	    
	    this.password = randomPassword(defaultPasswordLength);
	    System.out.println("Your password is: " + this.password);
	    
	    //Combine elements to generate email 
	    
	    email = FirstName.toLowerCase() + "." + LastName.toLowerCase()+ "@" + department + "." + companySuffix; 
//	    System.out.println("Your email is: " + email);
	}
	
	// Ask for the department
	
	private String setDepartment() {
		
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the Department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales" ;}
		else if (depChoice == 2) {
			return "dev";
		}else if (depChoice == 3) {
			return "acc";
		}else {
			return "";
		}
		
	}
	
	// Generate a random password
	
	private String randomPassword(int length){
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";
		char[] password = new char[length];
		
		for(int i=0; i<length ; i++) {
			int rand =(int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		
		return new String(password);
	}
	
	// Set the mailbox capacity
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	
	// Set the alternate mail
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
	}
	// Change the password
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity () {return mailboxCapacity;}
	
	public String getAlternateEmail() {return alternateEmail;}
	
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + FirstName + " " + LastName +"\n" +
		       "COMPANY EMAIL: " + email +"\n" +
		       "MAILBOX CAPACITY: " + mailboxCapacity +"mb";
	}
	
}

package com.EmailGenerator;

import java.util.*;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	//private int defaultPasswordLength;
	private String alternateEmail;
	private String companyName = "ZXCompany.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email is Generated " + firstName + " " + lastName);

		this.department = setDepartment();
		//System.out.println("Your Department is : " + department);

		// here we are declaring the length of the password which is 8;
		this.password = randomPassword(8);
		// System.out.println("Your Password has been Generated ");
		//System.out.println("Your Password is " + password);

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
		this.email = email;
		//System.out.println("Your Email is : " + email);
	}

	// Setting the Department
		Date date = new Date();

	private String setDepartment() {

		System.out.println("Enter Your Department \n1 for Sales\n2 for Development\n3 for Accounts\n4 for Exit");
		Scanner Input = new Scanner(System.in);
		int chooseDep = Input.nextInt();
		if (chooseDep == 1) {
			return "Sales";
		} else if (chooseDep == 2) {
			return "Development";
		} else if (chooseDep == 3) {
			return "Accounts";
		} else if (chooseDep == 4) {
			return "Exit";
		} else {
			System.out.println("Exit is in the Progress....");
			System.exit(0);
		}
		return " ";
	}

	// Generating the Password for Email Address

	private String randomPassword(int lenght) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*()_+";
		char[] password = new char[lenght];
		for (int i = 0; i < lenght; i++) {

			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}

		// here we did type cast because it was confusing between char password & String
		// Password
		return new String(password);

	}

	public void setmailBoxCpacity(int Capacity) {
		this.mailBoxCapacity = Capacity;

	}

	public void setAlternameEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	public void changingPassword(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DisplayName : " + firstName +" "+lastName +"\n"+
				"Company Email : " + email + "\n" +
				"Email Password : " + password + "\n" +
				"mailBoxCapacity : " + mailBoxCapacity + "mb"+ "\n"+
				"Date : " +date;
				
	}
	
	public String EmailAddress() {
		return email;
	}
	
	public String FullName() {
		return firstName + "" +lastName;
	}
	
	public String Password() {
		return password;
	}

}

















package com.EmailGenerator;

public class EmailApp {

	public static void main(String[] args) {
		
		Email Employee1 = new Email("Coder" , "X");
		Email Employee2 = new Email("Roy" , "K");
		Employee1.showInfo();
		Employee2.showInfo();
		System.out.println(Employee1.showInfo());
		System.out.println(" ");
		System.out.println(Employee2.showInfo());
		//System.out.println(Employee1.EmailAddress());
	}

}

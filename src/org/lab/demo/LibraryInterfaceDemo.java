package org.lab.demo;


public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers kid1 = new KidUsers();
		kid1.setAge(10);
		kid1.registerAccount();
		kid1.setAge(18);
		kid1.registerAccount();
		
		kid1.bookType = "Kids";
		kid1.requestBook();
		kid1.bookType = "Fiction";
		kid1.requestBook();
		
		AdultUsers adult1 = new AdultUsers();
		adult1.age = 5;
		adult1.registerAccount();
		adult1.age = 23;
		adult1.registerAccount();
		
		adult1.bookType = "Kids";
		adult1.requestBook();
		adult1.bookType = "Fiction";
		adult1.requestBook();
	}
}

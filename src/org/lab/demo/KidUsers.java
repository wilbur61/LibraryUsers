package org.lab.demo;

public class KidUsers implements LibraryUser {
	private int age;
	String bookType;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void registerAccount() {
		if(age < 12) 
			System.out.println("You have successfully registered under a Kids account!");
		else
			System.out.println("Sorry, age must be less than 12 to register as a kid.");
	}
	
	public void requestBook() {
		if(bookType.equals("Kids"))
			System.out.println("Book issued successfully, please return the book within 10 days.");
		else
			System.out.println("Oops, you are allowed to take only kids books.");
	}
}
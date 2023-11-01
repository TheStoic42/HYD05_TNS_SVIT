package com.svit.dayseven;

public class AbstractClassMain {
	public static void main(String[] args) {
		Veg john = new Veg();
	    john.Speak();
		john.eat();
		System.out.println("=======================");
		NonVeg mia = new NonVeg();
		mia.Eat();
	}
}

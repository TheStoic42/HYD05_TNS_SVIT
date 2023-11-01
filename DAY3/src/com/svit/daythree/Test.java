package com.svit.daythree;

public class Test {
public static void main(String[] args) {
		
		Derived obj = new Derived();
				
		Derived.display(); // it will print the result present in Base --> display() because it is a static method overriding not possible
		obj.print();   // print() is instance method so overriding is possible
		
	
		
	}
}

package com.svit.dayfour;

public class Test {
    public static void main(String args[ ])  {
        Derived obj1 = new Derived();
        // Base obj1 = new Base();
         
        Derived Base;
		// As per overriding rules this should call to class Derive's static
        // overridden method. Since static method can not be overridden, it
        // calls Base's display()
        display(); 

        // Here overriding works and Derive's print() is called
        obj1.print();    
     }

	private static void display() {
		// TODO Auto-generated method stub
		
	}
}
package com.svit.daythree;

public class ParameterizedConstructor {
    private String number;

	public ParameterizedConstructor(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        int number=2;//local variable
                ParameterizedConstructor obj = new ParameterizedConstructor (4); // Parameterized Constructor Called
                System.out.println("Number value is: "+obj.number);//Instance variable accessed through the object created through the class which has the Instance variable 
                System.out.println("Number value is: "+number);//local variable accessed
            }
}
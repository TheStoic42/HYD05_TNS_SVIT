package com.svit.dayfive;

import com.svit.dayfive.DefaultConstructorExample;

public class DefaultConstructorExample {
	 int number;
	    public DefaultConstructorExample() {
	        System.out.println("Constructor Called");
	        number=5;
	    }
	  
		public static void main(String[] args) {
	        
	    	DefaultConstructorExample obj = new DefaultConstructorExample(); // Constructor Called
	System.out.println("Number value is: "+obj.number);

	    }
}

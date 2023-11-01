package com.svit.dayseven;

public class Super2main {
	void eat()
	{
		System.out.println("eating bread...");
	}  
	
	void bark()
	{
		System.out.println("barking...");
	}  
	
	void work()
	{  
	Super();  
	bark();  
	eat();
	}  
	
	private void Super() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Super2main a1 = new Super2main();
		a1.work();
	}

	
}

package com.svit.daysix;

public class Encapsulation1 {
	private String name="john";
	private int age=25;
	private String gender="Male";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		
	
	
	Encapsulation1 e2 = new Encapsulation1();
	System.out.println(e2.getAge());
	System.out.println(e2.getName());
	System.out.println(e2.getGender());
	}
}

package com.svit.daysix;

public class InstanceOverridingTest {
	  @SuppressWarnings("hiding")
	public static <Parent> void main(String[] args) {
			// Parent p1 = new Parent();
			// p1.show();
			
			Child p2 = new Child();
			p2.show();
}
}
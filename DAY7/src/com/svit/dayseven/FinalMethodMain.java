package com.svit.dayseven;

public class FinalMethodMain {
	//void run()   // Error occurs becuase when final used in method then no overriding is possible. 
		{
			System.out.println("Running safely with 100kmph");
		}
		
		public static void main(String[] args) {
			FinalMethodMain f1 = new FinalMethodMain();
			f1.run();
		}

		private void run() {
			// TODO Auto-generated method stub
			
		}
}

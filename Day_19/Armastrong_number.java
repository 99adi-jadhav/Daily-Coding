package com.control_statements;

public class Armastrong_number {
	   
	static  int armastrongNum = 153 ; 

	public static void main(String[] args) {
		  
		int i = 153;
		int sum = 0;
		int temp = 0 ;
		
		 while(i < 0) {
			 
			 int r = i % 10 ; // ectract last digit
			 sum = sum + (r * r * r); // calculate cube add to sum
			 i = i / 10 ; // remove last digit
			 
			 
		 }
		 
		 if(temp == sum) { // checking origanl number is equal to sum
			    
			 System.out.println("it is an armstrong number");
			 
		 }
		 else {
			  
			 System.out.println("it is not armstrong number");
		 }

	}

}

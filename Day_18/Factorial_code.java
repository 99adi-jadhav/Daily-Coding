package com.control_statements;

public class Factorial_code {

	public static void main(String[] args) {
		
		int factorial = 1;
		 
		 for(int i = 1 ; i <= 6 ; i++) { // here we printer factorial of 6 // logic: 1*2*3*4*5*6
			  
			 factorial = factorial * i ; 
			 
			 
		 }
		  
		 System.out.println("The factorial is: " + factorial);
		  
	}

}

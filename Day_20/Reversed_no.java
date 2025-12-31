package com.control_statements;

public class Reversed_no {

	public static void main(String[] args) {
	 
		
		 int reversed_num = 0 ; 
		 
		 for( int num = 156 ; num!=0 ; num/=10) { 
			 
			 int digit = num % 10 ; 
			 reversed_num = reversed_num * 10 + digit ;
			 
		 }
		 
		 System.out.println("The Reversed number is : " + reversed_num);
		
	}

}

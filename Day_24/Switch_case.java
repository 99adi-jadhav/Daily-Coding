package com.control_statements;

public class Switch_case {

	public static void main(String[] args) {
	  
	 System.out.println("Welcome");
	 System.out.println("1.addition");
	 System.out.println("2.subtraction");
	 System.out.println("3.Print 1 to 50 in for loop");
	 
	 int switchh = 1; // here we chose case using this variable we alsp write it using get input to access case through terminal
	 
	 switch(switchh) {
	   
	 case 1 :
		 
		  int a = 10 , b = 20 , sum ; 
		  sum = a + b ;
		  System.out.println("The sum of a & b is "+ sum);
          break; 
          
	 case 2 : 
		 int  c = 50 , d = 30 , ans; 
		 ans = c - d ;
		 System.out.println("The sum of a & b is "+ ans);
         break; 
         
	 case 3 :
		 

		 for(int i=0 ; i<=50 ; i++ ) {
			  
			  System.out.println(i);
			 
		 }
		 
		 break ; 
		 
		 default : 
			 
			 System.out.println("case invalid");

		 
		  
	 
	 }
	 
	}

}

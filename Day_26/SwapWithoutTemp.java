package Day02;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swapping : "  + num1 + " & "+ num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		
		System.out.println("After Swapping : "  + num1 + " & "+ num2);
		sc.close();
	}

}

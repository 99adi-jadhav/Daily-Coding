package Day02;

import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks Subject 1 : ");
        int sub1 = sc.nextInt();
    
        System.out.println("Enter Marks Subject 2 : ");
        int sub2 = sc.nextInt();

        System.out.println("Enter Marks Subject 3 : ");
        int sub3 = sc.nextInt();

        System.out.println("Enter Marks Subject 4 : ");
        int sub4 = sc.nextInt();

        System.out.println("Enter Marks Subject 5 : ");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percent = total / 5;

        System.out.println("Total is : " + total + "%");
        System.out.println("percentage is : " + percent + "%");

        sc.close();
    }
}

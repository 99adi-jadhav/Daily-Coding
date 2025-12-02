import java.util.Scanner;

public class Addition{
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
   
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        int num3 = num1 + num2;

        System.out.println("Addition of " + num1 + " & " + num2 + " is : " + num3);

        sc.close();
    }
}
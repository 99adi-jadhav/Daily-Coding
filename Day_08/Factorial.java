import java.util.Scanner;

public class Factorial
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number If You Want :");
        int num = sc.nextInt();

        int num1 = 1;

        for(int i = 1; i <= num;i++)
        {
            num1 *= i;
        }
        System.out.println("Factorial of " + num + " is: " + num1);
    }
}
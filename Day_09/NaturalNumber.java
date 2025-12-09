import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        System.out.println("Natural numbers up to " + num + ":");
        for (int i = 1; i <= num; i++) 
        {
            System.out.println(i + " ");
            sum = sum + i;
        }

        System.out.println("Addition of Natural numbers is :  " + sum);
        sc.close();
    }
}

import java.util.Scanner;

public class SquareofNatural {
        public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Natural numbers up to " + num + ":");
        for (int i = 1; i <= num; i++) 
        {
            int sum = 0;
            sum = sum + i * i;
            System.out.println("Addition of Natural Number is : " + sum);

        }
        sc.close();
    }
}

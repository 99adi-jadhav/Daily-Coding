import java.util.Scanner;

public class  celToFeh{
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Celsius You Want : ");
        double Num1 = sc.nextInt();

        double cel = (Num1 * 9/5) + 32;

        System.out.println("Fahrenheit is : " + cel);

         sc.close();
    }
   
}
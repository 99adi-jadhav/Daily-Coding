import java.util.Scanner;

public class KmToMl
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Kilometer If You Want : ");
        int km = sc.nextInt();

        double convert = km * 0.621371;

        System.out.println("The Converted Miles is : " + convert);

    }
}
import java.util.Scanner;

public class positive_negative
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number If You Want :");
        int num = sc.nextInt();

        if(num > 0)
        {
        System.out.println("The Number is Positive : " + num);
        }
        else if(num < 0)
        {
        System.out.println("The Number is Negative : " + num);
        }
        else
        {
         System.out.println("The Number is Zero : " + num);
        }
        
    }
}
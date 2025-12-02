import java.util.Scanner;

public class swap{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Number : ");
        int num1 = sc.nextInt();
        
        System.out.print("Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping Numbers : " + num1 + " & " + num2);

        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After Swapping Numbers : " + num1 + " & " + num2);


        sc.close();
    }
}
package Day_01;
import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

      System.out.print("Enter First number: ");
      int num1= sc.nextInt();

      System.out.print("Enter Second number: ");
      int num2 = sc.nextInt();

      System.out.print("Enter Third number: ");
      int num3 = sc.nextInt();

      int large = 0;

      if(num1 >= num2 && num1 >= num3)
      {
        large = num1;
        System.out.println("Num1 is Greater : " + num1);
      }
      else if(num2 >= num3 && num2 >= num3)
      {
        large = num2;
        System.out.println("Num2 is Greater : " + num2);
      }
      else
      {
        large = num3;
        System.out.println("Num3 is Greater :" + num3);
      }

      System.out.println("Largest Number is : "+ large);

      sc.close();
    }
}

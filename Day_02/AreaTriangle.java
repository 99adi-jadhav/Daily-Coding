import java.util.Scanner;

public class AreaTriangle{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base Number : ");
        int base = sc.nextInt();
   
        System.out.print("Enter Height Number : ");
        int height = sc.nextInt();

        double Area = 0.5  * base * height;
        System.out.print("Area of Triangle is : " + Area);
        sc.close();
    }
}


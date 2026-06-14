package Day02;
import java.util.Scanner;

public class SquareNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int square = num * num;

        System.out.println("Square of " + num + " is " + square);

        sc.close();
    }
}

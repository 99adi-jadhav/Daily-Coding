package Day02;

import java.util.Scanner;

public class FahtoCel {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + celsius);

        sc.close();
    }
}

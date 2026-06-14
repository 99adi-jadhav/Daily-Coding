package Day02;

import java.util.Scanner;

public class MeterToKm {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter meters: ");
        double meter = sc.nextDouble();

        double kilometer = meter / 1000;

        System.out.println("kilometers: " + kilometer);

        sc.close();
    }
}

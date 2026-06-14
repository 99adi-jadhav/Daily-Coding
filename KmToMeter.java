package Day02;

import java.util.Scanner;

public class KmToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();

        double meter = km * 1000;

        System.out.println("Meters: " + meter);

        sc.close();
    }
}

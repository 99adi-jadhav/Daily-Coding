package Day02;

import java.util.Scanner;

public class CubeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int cube = num * num * num;

        System.out.println("Square of " + num + " is " + cube);

        sc.close();
    }
}

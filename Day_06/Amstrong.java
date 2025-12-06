import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number You Want: ");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is NOT an Armstrong Number");
        }

        sc.close();
    }
}

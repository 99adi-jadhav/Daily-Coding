import java.util.Scanner;

public class square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        int i = 1;
        int result = 1;

        while (i * i <= n) {
            result = i;
            i++;
        }

        System.out.println("Square root (floor) = " + result);
    }
}

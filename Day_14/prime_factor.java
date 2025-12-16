import java.util.*;

public class prime_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Unique Prime Factors: ");

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                while (n % i == 0) {
                    n = n / i;
                }
            }
        }
    }
}

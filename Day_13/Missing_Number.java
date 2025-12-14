import java.util.Scanner;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }

        int total = n * (n + 1) / 2;
        System.out.println("Missing Number: " + (total - sum));
    }
}

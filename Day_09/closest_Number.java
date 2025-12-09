import java.util.Scanner;

class closest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target number: ");
        int target = sc.nextInt();

        int close = arr[0];

        for (int i = 1; i < n; i++) {
            int d1 = arr[i] - target;
            if (d1 < 0) d1 = -d1;

            int d2 = close - target;
            if (d2 < 0) d2 = -d2;

            if (d1 < d2)
                close = arr[i];
        }

        System.out.println("Closest number is: " + close);
        sc.close();
    }
}

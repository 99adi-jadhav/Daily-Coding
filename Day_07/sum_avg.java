import java.util.Scanner;

public class sum_avg {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];   
        }

        double average = (double) sum / n; 

        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);

        sc.close();
    }
}

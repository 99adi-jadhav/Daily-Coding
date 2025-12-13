import java.util.*;

public class List_element {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);  

        int secondLargest = arr[n - 2];

        System.out.println("Second Largest Number: " + secondLargest);
    }
}

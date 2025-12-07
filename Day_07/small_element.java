import java.util.Scanner;

public class small_element {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int Small = arr[0]; 

        for(int i = 1; i < n; i++)
        {
            if(arr[i] < Small)
            {
                Small = arr[i];
            }
        }

        System.out.print("The Smallest Element in the Array is: " + Small);
        sc.close();
    }
}

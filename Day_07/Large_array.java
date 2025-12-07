import java.util.Scanner;

public class Large_array{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array If You Want : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0;i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int Large = 0;

        for(int i = 0; i  < n; i++)
        {
            if(arr[i] > Large)
            {
                Large = arr[i];
            }
        }

        System.out.println("The Largest Element in the Array is  :  " + Large);
        sc.close();
    }
}
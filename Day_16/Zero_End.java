public class Zero_End
 {
    public static void main(String[] args) 
    {
        int[] arr = {9, 3, 0 , 67, 0 ,34};
        int j = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] != 0) 
            {
                arr[j] = arr[i];
                j++;
            }
        }

        while (j < arr.length) 
        {
            arr[j] = 0;
            j++;
        }

        for (int x : arr) 
        {
            System.out.print(x + " ");
        }
    }
}

public class Remove_Duplicates 
{
    public static int removeDuplicates(int[] arr)
    {
        if (arr.length == 0) return 0;

        int j = 1;
        for (int i = 1; i < arr.length; i++) 
            {
            if (arr[i] != arr[i - 1]) 
                {
                arr[j] = arr[i];
                j++;
                }
            }
        return j; 
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 1, 2, 2, 3};
        int len = removeDuplicates(arr);

        for (int i = 0; i < len; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}

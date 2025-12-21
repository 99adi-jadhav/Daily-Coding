public class PowerFun
 {
    public static long power(int x, int n) 
    {
        long result = 1;
        for (int i = 0; i < n; i++) 
        {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        System.out.println(power(2, 5)); 
    }
}

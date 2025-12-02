import java.util.Random;

public class RandomNumber{
   public static void main(String[] args)
    {
        Random num = new Random();

        int num1 = num.nextInt(101);

        System.out.println("Random number : " + num1);
    }
}
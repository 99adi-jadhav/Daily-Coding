import java.util.Scanner;
import java.util.Random;

class Dice_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Enter number of times to roll dice: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int dice = r.nextInt(6) + 1;   
            System.out.println("Roll " + i + ": " + dice);
        }

        sc.close();
    }
}

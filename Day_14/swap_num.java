import java.util.*;

public class swap_num {
    public static void main(String[] args) {
        int a = 10, b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

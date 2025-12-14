import java.util.Scanner;

public class Repeating_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] visited = new boolean[256];
            int count = 0;

            for (int j = i; j < s.length(); j++) {
                if (visited[s.charAt(j)])
                    break;

                visited[s.charAt(j)] = true;
                count++;
            }
            if (count > max)
                max = count;
        }

        System.out.println("Longest Substring Length: " + max);
    }
}

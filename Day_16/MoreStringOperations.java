public class MoreStringOperations {
    public static void main(String[] args) {
        String str1 = "HELLO";
        String str2 = "WORLD";

        // 1. Concatenation
        String concat = str1 + str2;
        System.out.println("Concatenation: " + concat);

        // 2. Comparison
        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // 3. Length
        System.out.println("Length of str1: " + str1.length());

        // 4. Substring (from index 1 to 4)
        String sub = str1.substring(1, 4);
        System.out.println("Substring (1-4): " + sub);

        // 5. Reverse (without inbuilt reverse function)
        String reverse = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse += str1.charAt(i);
        }
        System.out.println("Reverse of str1: " + reverse);

        // 6. Palindrome Check
        String str3 = "MADAM";
        String rev = "";
        for (int i = str3.length() - 1; i >= 0; i--) {
            rev += str3.charAt(i);
        }
        if (str3.equals(rev)) {
            System.out.println(str3 + " is a Palindrome");
        } else {
            System.out.println(str3 + " is NOT a Palindrome");
        }

        // 7. Frequency Count
        String str4 = "PROGRAMMING";
        int[] freq = new int[256]; // ASCII table size
        for (int i = 0; i < str4.length(); i++) {
            freq[str4.charAt(i)]++;
        }
        System.out.println("Character frequencies in '" + str4 + "':");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " -> " + freq[i]);
            }
        }
    }
}

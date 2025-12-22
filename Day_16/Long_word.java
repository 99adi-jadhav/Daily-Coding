public class Long_word {
    public static void main(String[] args)
     {
        String sentence = "Vaishnavi Loves Aditya ";
        String[] words = sentence.split(" ");

        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) 
            {
                longest = w;
            }
        }

        System.out.println("Longest word is : " + longest);
    }
}

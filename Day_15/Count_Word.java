public class Count_Word 
{
    public static void main(String[] args) 
    {
        String sentence = "Aditya Jadhav";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word Count is : " + words.length);
    }
}

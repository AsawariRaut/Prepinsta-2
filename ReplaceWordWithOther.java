public class ReplaceWordWithOther
{
 public static void main(String[] args)
    {

        // Given String as input from which
        // word has to be removed
        String str = "This is the prepinsta";

        // Desired word to be removed
        String word = "the";
        // Replace all words by "" string
        // using replaceAll() method
        str = str.replaceAll("the", "");

        // Trim the string using trim() method
        str = str.trim();

        // Printing the final string
        System.out.print(str);
    }
}
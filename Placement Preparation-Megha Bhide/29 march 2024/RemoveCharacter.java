import java.util.Scanner;
 

public class RemoveCharacter {
 

    // Function to trim the non-alphabetical characters

    static void printwords(String str)

    {
 

        // eliminate leading and trailing spaces

        str = str.trim();
 

        // split all non-alphabetic characters

        String delims = "\\W+"; // split any non word

        String[] tokens = str.split(delims);
 

        // print the tokens

        for (String item : tokens) {
 

            System.out.println(item + " ");

        }

    }
 

    public static void main(String[] args)

    {
 

        String str = "Hello, how are you ?";

        printwords(str);

    }
}
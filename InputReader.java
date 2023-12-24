import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
/**
 * Write a description of class InputReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputReader
{
    // instance variables - replace the example below with your own
    private Scanner reader;
    private HashSet<String> input;
   

    /**
     * Constructor for objects of class InputReader
     */
    public InputReader()
    {
        // initialise instance variables
        reader = new Scanner(System.in);
        input = new HashSet<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public HashSet getInput()
    {
        System.out.println(">");
        String inputString = reader.nextLine().trim().toLowerCase();
        String[] words = inputString.split(" ");
        for (String str : words) {
            input.add(str);
        }
        return input;
    }
    
}

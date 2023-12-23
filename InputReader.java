import java.util.Scanner;
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

    /**
     * Constructor for objects of class InputReader
     */
    public InputReader()
    {
        // initialise instance variables
        reader = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getInput()
    {
        System.out.println(">");
        return reader.nextLine();
    }
}

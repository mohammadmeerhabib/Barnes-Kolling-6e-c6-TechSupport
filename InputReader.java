import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
/**
 * InputReader object scans input, trims it, converts to lower case and stores in 
 * a HashSet which is returned.
 * @author M M Habib
 * @version 20231225
 */
public class InputReader
{
    // instance variables - replace the example below with your own
    private Scanner reader;
    private HashSet<String> input;
   

    /**
     * Constructor instantiates a Scanner object and a HashSet object.
     */
    public InputReader()
    {
        // initialise instance variables
        reader = new Scanner(System.in);
        input = new HashSet<>();
    }

    /**
     * getInput reads a line of input, trims and converts to lowercase.
     * Line is split in words and stored in HashSet.
     * @param none
     * @return HashSet
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

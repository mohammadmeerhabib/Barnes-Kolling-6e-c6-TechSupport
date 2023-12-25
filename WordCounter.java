import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Write a description of class WordCounter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordCounter
{
    // instance variables - replace the example below with your own
    private HashMap<String, Integer> counter;

    /**
     * Constructor for objects of class WordCounter
     */
    public WordCounter()
    {
        // initialise instance variables
        counter = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addWords(HashSet input)
    {
        Iterator<String> it = input.iterator();
        while (it.hasNext()) {
            String word = it.next();
            Integer count = counter.getOrDefault(word, 0);
            counter.put(word, (count+1));
        }
    }
    /**
     * prints words with frequency. called after goodbye message.
     */
    public void printWords()
    {
        for (String name : counter.keySet()) {
            Integer value = counter.get(name);
            System.out.println(name + " : " + value);
        }
    }
}

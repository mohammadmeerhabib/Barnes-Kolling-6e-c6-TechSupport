import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
/**
 * WordCounter object takes a HashSet of words and stores them as keys in a HashMap.
 * Corresponding value in HashMap is number of times the word is used.
 * @author M M Habib
 * @version 20231225
 */
public class WordCounter
{
        private HashMap<String, Integer> counter;
    private Responder responder;
    /**
     * Constructor makes an instance of HashMap to store keys and frequency.
     * Makes a instance of Responder to check if word is associated with an answer already.
     */
    public WordCounter()
    {
        // initialise instance variables
        counter = new HashMap<>();
        responder = new Responder();
    }

    /**
     * addWords accepts HashSet and adds them to a HashMap.
     * Value is increased everytime a word is repeated
     * @param HashSet
     * @return none
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
     * printWords prints only those words and their frequency which are not already 
     * associated with an answer
     * @param none
     * @return none
     */
    public void printWords()
    {
        for (String name : counter.keySet()) {
            Integer value = counter.get(name);
            if (!responder.containsKey(name)){
                System.out.println(name + " : " + value);
            }
        }
    }
}

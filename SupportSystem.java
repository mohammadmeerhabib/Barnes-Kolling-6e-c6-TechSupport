import java.util.HashSet;
/**
 * SupportSystem controls tech support system
 * communicates with user, accepts input via reader and outputs response via responder and 
 * prints inputted word statistics for managers
 * @author M M Habib
 * @version 1
 */
public class SupportSystem
{
    private static int instances =0;
    private WordCounter counter;
    private InputReader reader;
    private Responder responder;
    /**
     * Constructor creates reader as an instance of class InputReader. Also creates counter as
     * an instance of WordCounter. Creating counter in the constructor
     * keeps track of word count over multiple starts after a single instantiation.
     * also instantiates object responder (Responder).
     * @param none
     * @return none
     */    
    public SupportSystem()
    {
        instances++;
        reader = new InputReader();
        counter = new WordCounter();
        responder = new Responder();
    }
    /**
     * numberOfInstances method keeps count of instances created
     * @param none
     * @return int
     */
    public static int numberOfInstances()
    {
        return instances;
    }
    /**
     * main method
     */
    public static void main(String[] args)
    {
        SupportSystem supportSystem = new SupportSystem();
        supportSystem.start();
    }
    /**
     * instances method show total instances
     */
    public int instances()
    {
        int instances = numberOfInstances();
        return instances;
    }
    /**
     * start method starts the process, prints welcom message and how to quit.
     * takes input via input reader and generates a response via responder.
     * prints exit message
     * calls counter after exit message to print frequency of words used other than
     * words already been used in map.
     * @param none
     * @return none
     */
    public void start()
    {
        printWelcome();
        boolean flag = false;
        //WordCounter counter = new WordCounter();//can be initiated here to loose previous
        //info after each start.
        while (!flag) {
            HashSet<String> input = new HashSet<>();
            input = reader.getInput();
            counter.addWords(input);
                        if (input.contains("bye")) {
               flag = true;
            } else {
                //Responder responder = new Responder();
                System.out.println(responder.generateResponse(input));
            }
            input.clear();
        }
        printGoodbye();
        counter.printWords();
            }
    
    /**
     * printWelcome prints welcome message
     * @param none
     * @return none
     */
    public void printWelcome()
    {
        System.out.println("Hi, Welcome to Tech Support System site!");
        System.out.println();
        System.out.println("Please enter issue you are facing clearly");
        System.out.println("This will help us give you advice propertly");
        System.out.println("When done, please enter 'bye', to log out-");
    }
    
    /**
     * printGoodBye prints goodbye message.
     * @param none
     * @return none
     */
    public void printGoodbye()
    {
        System.out.println("Bye! Nice talking to you-");
    }
}

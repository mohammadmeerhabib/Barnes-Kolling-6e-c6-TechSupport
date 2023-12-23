
/**
 * Write a description of class SupportSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SupportSystem
{
    // instance variables - replace the example below with your own
    InputReader reader;    
    Responder responder;
    /**
     * Constructor for objects of class SupportSystem
     */
    public SupportSystem()
    {
        // initialise instance variables
        reader = new InputReader();
        responder = new Responder();
        
    }

    /**
     * start to run support system, takes input via input reader and generates response 
     * via Responder
     * @param none
     * @return none
     */
    public void start()
    {
        boolean finished = false;
        printWelcome();
        while (!finished){
            String input = reader.getInput().trim().toLowerCase();
            if (input.startsWith("bye")){
                finished = true;
                printGoodbye();
            } else {
            System.out.println(responder.generateResponse());
            }
        }
    }
    /**
     * prints welcome message
     * @param none
     * @return none
     */
    public void printWelcome()
    {
        System.out.println("Welcome to Technical Support System." );
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }
    public void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}

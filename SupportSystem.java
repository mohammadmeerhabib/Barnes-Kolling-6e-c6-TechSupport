/**
 * reads via reader and outputs response via responder
 */
public class SupportSystem
{
    private Responder responder;
    private InputReader reader;
    /**
     * constructs responders as an instance of class Responder and 
     * reader as an instance of class InputReader
     */    
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }
    /**
     * start method starts the process and takes input via input reader and
     * generates a response via responder.
     * @param none
     * @return none
     */
    public void start()
    {
        printWelcome();
        boolean flag = false;
        while (!flag) {
            String input = reader.getInput().trim().toLowerCase();
            if (input.startsWith("bye")) {
                flag = true;
            } else {
                System.out.println(responder.generateResponse());
            }
        }
        printGoodbye();
    }
    
    /*
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
     * print goodBye prints goodbye message.
     * @param none
     * @return none
     */
    public void printGoodbye()
    {
        System.out.println("Bye! Nice talking to you-");
    }
}

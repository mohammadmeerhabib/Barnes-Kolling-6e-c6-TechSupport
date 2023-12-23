
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void support()
    {
        reader.getInput();
        System.out.println(responder.generateResponse());
    }
}

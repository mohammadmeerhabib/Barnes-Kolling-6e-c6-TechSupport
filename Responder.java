import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Responder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Responder
{
    // instance variables - replace the example below with your own
    public Random randomGenerator;
    public ArrayList<String> responses;
    /**
     * Constructor for objects of class Responder
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new ArrayList<>();
        listResponses();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String generateResponse()
    {
        return responses.get(randomGenerator.nextInt(responses.size()));
    }
    public void listResponses()
    {
        responses.add("That sounds odd. Could you explain a bit more please?");
        responses.add("No other customer had this issue. What system do you have?");
        responses.add("I need more detailed information");
        responses.add("This parts is covered in the manual. Can you please read that" + 
        " and see if it helps.");
        responses.add("Your description is not clear. Anyone more experience with you?");
        responses.add("Can you please elaborate on it.");
    }
}

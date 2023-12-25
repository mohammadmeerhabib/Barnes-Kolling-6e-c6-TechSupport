import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
    public HashMap<String, String> responseMap;
    /**
     * Constructor for objects of class Responder
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new ArrayList<>();
        responseMap = new HashMap<>();
        listResponses();
        fillResponseMap();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String generateResponse(HashSet input)
    {
        Iterator<String> it = input.iterator();
        //boolean responded = false;
        String response = null;
        while (it.hasNext() && response == null) {
            response = responseMap.get(it.next());
            /*if (response != null) {
                responded = true;
            }*/
        }
        if (response == null) {
            int lastNum = 0;
            int randNum = 0 ;
            while (randNum == lastNum) {
                randNum = randomGenerator.nextInt(responses.size());
            }
            lastNum = randNum;
            return responses.get(randNum);
        } else {
            return response;
        }
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
        responses.add("Have you modified your system in any way?");
        responses.add("Where did you purchase the system?");
    }
    /**
     * creates response map
     * @param none
     * return none
     */
    public void fillResponseMap()
    {
        responseMap.put("slow", "This issue is related to hardware \n" +
        "Upgrading your computer will help.");
        responseMap.put("sluggish", "This issue is related to hardware \n" +
        "Upgrading your computer will help.");
        responseMap.put("bug", "All software can have bugs!\n" + 
        "Our engineers are working on it.");
        responseMap.put("expensive", "All our products are competitively priced. \n" + 
        "Our products have exceptional quality at reasonable prices");
        responseMap.put("costly", "All our products are competitively priced. \n" + 
        "Our products have exceptional quality at reasonable prices");
        responseMap.put("pricey", "All our products are competitively priced. \n" + 
        "Our products have exceptional quality at reasonable prices");
    }
}

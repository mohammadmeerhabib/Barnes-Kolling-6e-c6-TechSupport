import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/**
 * Responsder class does following
 * 1 creates a list of random reponses in ArrayList responses.
 * 2 creates a map of responses to commonly used words in HashMap responseMap
 * 3 accetps input and checks it against responseMap and responds if there is a match.
 * 4 if no match in responseMap than generates a random answer from responses.
 * @author M M Habib
 * @version 20231225
 */
public class Responder
{
    // instance variables - replace the example below with your own
    public Random randomGenerator;
    public ArrayList<String> responses;
    public HashMap<String, String> responseMap;
    /**
     * Constructor instantiates objects of class Random, ArrayList and HashMap.
     * Also calls methods listResponses and fillResponseMap.
     * @param none
     * @return none
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
     * generateResponse checks input against responseMap and returns if associated value.
     * Otherwise it returns a ransom response.
     * @param HashSet
     * @return String
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
    /**
     * listResponses populates responses (ArrayList) with commond words as keys and values 
     * as response
     * @param none
     * @return none
     */
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
     * fillResponseMap populates responseMap with common words as keys and associated
     * response as values.
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
    /**
     * containsKey method checks for the presence of parameter key
     * @param key
     * @return boolean true if present
     */
    public boolean containsKey(String key)
    {
        return responseMap.containsKey(key);
    }
}

/**
 *
 * @author Michael Vineyard
 */
import java.util.*;
public class RTSLabs {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        
        //Get list of numbers and comparative integer
        System.out.println("Enter the list of numbers separated by commas: ");
        String list = input.nextLine();
        System.out.println("Which value would you like to compare?");
        int value = input.nextInt();
        //clear input
        input.nextLine();
        //create list
        String[] arrayList = list.split(",");
        //call aboveBelow method passing list and comparative value
        aboveBelow(arrayList, value);
        //get string and rotation value
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        int rotate = -1;
        while (rotate < 0) {
            System.out.println("Enter a positive number for the rotation amount");
            rotate = input.nextInt();
        }
        //clear input
        input.nextLine();
        //call method passing string and how many times to rotate
        stringRotation(string, rotate);
    }
    //aboveBelow method with list and int arguments
    public static void aboveBelow(String[] list, int value) {
        //declare hash and assign initial key and values
        HashMap<String, Integer> results = new HashMap<String, Integer>();
        results.put("Below", 0);
        results.put("Above", 0);
        //loop through the list 
        for (int i = 0; i < list.length; i++) {
            //compare value to the numbers in the list
            if (value > Integer.parseInt(list[i]))
                //if value is greater than the list value, add to the Below key
                results.put("Below", results.get("Below") + 1);    
            else if (value < Integer.parseInt(list[i]))
                //if value is less than the list value, add to the Above key
                results.put("Above", results.get("Above") + 1);
        }
        //print results
        System.out.println(results);
        
    }
    //declare stringRotation method with string and int arguments
    public static void stringRotation(String string, int rotate) {
        //get length of string
        int length = string.length();
        //iterate through the desires amount of rotations
        for (int i = 0; i < rotate; i++) {
            //recreate the string with the last letter in front, followed by the rest of the string
            string = string.charAt(length -1) + string.substring(0, length - 1);
        }
        //print results
        System.out.println(string);
    }
}

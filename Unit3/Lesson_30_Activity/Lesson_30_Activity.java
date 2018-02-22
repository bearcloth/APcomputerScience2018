/*
 * Lesson 30 Coding Activity 
 * Due to a problem with a scanner an array of words was created 
 * with spaces in incorrect places. Write the code to process the 
 * list of words and trim any spaces out of the words.
 *
 * So if the list contains:
 *      {"every", " near ing ", " checking", "food ", "stand", "value "}
 *
 * It should be changed to hold:        
 *      {"every", "nearing", "checking", "food", "stand", "value"}
 *         
 * Note that this activity does not require you to print anything. 
 * Your code should end with the array list still declared and
 * containing the resulting words.
 * 
 */


import java.util.Scanner;
import java.lang.String;

class Lesson_30_Activity {
  
  /*
   * Your code should end with the following array modified as the 
   * instructions above specify. You may modify the elements in 
   * this list but make sure you do not add or remove anything from it. 
   */
  public static String [] list = {"every", " near ing ", " checking", "food ", "stand", "value "};
  
  public static void main(String[] args)
  {
    for(int i = 0; i < list.length; i++)
    {
      list[i] = list[i].replaceAll("\\s","");
    }
    
    for(int i = 0; i < list.length; i++)
    {
      System.out.println(list[i]);
    }
  }
}
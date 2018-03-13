/**
 * 
 * Anthony Rivera
 *
 * 3/12/2018
 * 
 * ********************
 * Array List Practice*
 * ********************
 */



import java.util.ArrayList;
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    String w;
    
    System.out.println("Please enter words, enter STOP to stop the loop.");
    
    while(true)
    {
      w = scan.nextLine();
      if(w.equals("STOP"))
        break;
      
      words.add(w);
    }
    
    System.out.println(words.size());
    System.out.println(words);
    
    if(words.size() > 2)
    {
      words.remove(0);
      words.remove(words.size() - 1);
    }
    
    System.out.println(words);
  }
}
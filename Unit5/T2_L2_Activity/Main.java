import java.util.ArrayList;
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList <String> list = new ArrayList<String> ();
    
    System.out.println("Please enter words, enter STOP to stop the loop.");
    
    // could have used a while loop or could have simply done for(;;)
    // this adds each user input to the list of animals
    for(int i = 0; i != -1; i++)
    {
      String animal = scan.nextLine();
      if(animal.equals("STOP"))
        break;
      
      list.add(animal);
    }
    
    // goes through the list and checks each index e to see if it contains the letter a and prints it
    for(String e: list)
    {
      boolean go = false;
      for(int i = 0; i < e.length(); i++)
      {
        if(e.charAt(i) == 'a')
          go = true;
      }
      
      if(go)
        System.out.println(e);
    }
  }
}
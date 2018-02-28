import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    String message;
    String pivot;
    
    System.out.println("Enter a string: ");
    message = scan.nextLine();
    System.out.println("Enter a pivot string: ");
    pivot = scan.nextLine();
    
    int s = message.indexOf(pivot);
    
    if(s != -1)
    {
      String leftOfPivot = message.substring(0, s);
      String rightOfPivot = message.substring(s + pivot.length()); 
      
      System.out.println(rightOfPivot + pivot + leftOfPivot);
      
    }
    else
    {
      System.out.println("Error: Pivot String not found.");
    }
    
    
  }
}

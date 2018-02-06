import java.lang.Math;
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    String name;
    int n1, n2, n3; // these will be the logical tests
    
    System.out.println("Welcome. What is your name?");
    name = scan.nextLine();
    
    System.out.println("Hello " + name + ". Try your best to crack the code!");
    
    while(true)
    {
      System.out.println("PHASE 1");
      System.out.println("Enter a number: ");
      n1 = scan.nextInt();
      
      if(n1 == 3)
      {
        System.out.println("Correct!\n\n");
      }
      else
      {
        System.out.println("Sorry, that was incorrect!");
        System.out.println("Better luck next time!");
        break;
      }
      
      System.out.println("PHASE 2");
      System.out.println("Enter a number: ");
      n2 = scan.nextInt();
      
      if(n2 == 1 || (n2 >= 33 && n2 <= 100))
      {
        System.out.println("Correct!\n\n");
      }
      else
      {
        System.out.println("Sorry, that was incorrect!");
        System.out.println("Better luck next time!");
        break;
      }
      
      System.out.println("PHASE 3");
      System.out.println("Enter a number: ");
      n3 = scan.nextInt();
      
      if(n3 > 0 && (n3 % 7 == 0 || n3 % 3 == 0))
      {
        System.out.println("Correct!");
        System.out.println("You have cracked the code!");
        break;
      }
      else
      {
        System.out.println("Sorry, that was incorrect!");
        System.out.println("Better luck next time!");
        break;
      }
      
    } 
  }
}
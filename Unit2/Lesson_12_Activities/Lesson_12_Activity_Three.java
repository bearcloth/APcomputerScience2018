/*
 * Lesson 12 Coding Activity 3 
 * Test if a number input from the keyboard is a valid
 * test score (between 0 and 100 inclusive).
 *     
 *     Sample Run 1
 *         Enter a test score:
 *         78.5
 *         Valid
 *
 *         
 *      Sample Run 2
 *         Enter a test score:
 *         179
 *         Not Valid         
 * 
 */


import java.util.Scanner;

class Lesson_12_Activity_Three {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    double num1;
    
    System.out.println("Enter a test score: ");
    num1 = scan.nextDouble();
    
    if(num1 >= 0 && num1 <= 100)
    {
      System.out.println("Valid");
    }
    
    if(num1 < 0 || num1 > 100)
    {
      System.out.println("Not Valid");
    }
    
  }
}
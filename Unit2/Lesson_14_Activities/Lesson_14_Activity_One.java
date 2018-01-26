/*
 * Lesson 14 Coding Activity 1
 * Test if an integer is not between 5 and 76 inclusive.
 *
 *     Sample Run 1
 *         Enter a number:
 *         7
 *         False
 *
 *         
 *      Sample Run 2
 *         Enter a number:
 *         1   
 *         True
 * 
 */


import java.util.Scanner;

class Lesson_14_Activity_One {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int n;
    
    System.out.println("Enter a number: ");
    n = scan.nextInt();
    
    if( !( n >= 5 && n <= 76))
    {
      System.out.println("True");
    }
    else
    {
      System.out.println("False");
    }
  }
}
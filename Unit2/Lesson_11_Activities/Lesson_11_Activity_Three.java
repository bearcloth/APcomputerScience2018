/*
 * Lesson 11 Coding Activity 3
 * Get two integers from the keyboard and test if they are equal.
 * If they are, print "YES" (without the quotes).
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_Three {   
  public static void main(String[] args) 
  { 
    Scanner scan = new Scanner(System.in);
    
    int num1, num2;
    
    System.out.println("Please enter a number: ");
    num1 = scan.nextInt();
    
    System.out.println("Please enter the second number: ");
    num2 = scan.nextInt();
    
    if(num1 == num2)
    {
      System.out.println("YES");
    }
  }
}
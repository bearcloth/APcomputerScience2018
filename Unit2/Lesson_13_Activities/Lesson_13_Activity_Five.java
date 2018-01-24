/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;
import java.lang.Math;

class Lesson_13_Activity_Five {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int answer;
    
    int rNum1 = (int)((Math.random() * 12) + 1);
    int rNum2 = (int)((Math.random() * 12) + 1);
    
    System.out.println("The two random numbers: " + rNum1 + " and " + rNum2);
    
    System.out.println("Enter what the two numbers multiplied equals: ");
    answer = scan.nextInt();
    
    if(answer == (rNum1 * rNum2))
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Wrong");
    }
  }
}
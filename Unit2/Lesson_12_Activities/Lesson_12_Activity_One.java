/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

class Lesson_12_Activity_One {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int num1, num2, num3;
    double avg;
    
    System.out.println("Enter three ints: ");
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt();
    
    avg = (double)((num1 + num2 + num3) / (double)3);
    
    if(avg >= 89.5)
    {
      System.out.println("ABOVE AVERAGE");
    }
    
  }
}
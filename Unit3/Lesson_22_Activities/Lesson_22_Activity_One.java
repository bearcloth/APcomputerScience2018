/*
 * Lesson 22 Coding Activity 1
 * Write the code to take a String and print it with one letter per line.

  Sample run:

  Enter a string:
  bought
  b
  o
  u
  g
  h
  t
  
*/ 

import java.util.Scanner;
import java.lang.Math; 
import java.lang.String;

class Lesson_22_Activity_One {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    String uin;
    int i = 0;
    
    System.out.println("Enter a string:");
    uin = scan.nextLine();
    
    while(i < uin.length())
    {
      System.out.println(uin.charAt(i));
      i++;
    }
  }
}
/*
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.

  Sample run:

  Enter a string:
  bought
  b
      o
          u
              g
                  h
                      t
  Use a tab character for every four spaces in the sample.

  Hint: You may need more than one loop.
  
*/ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_Two {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    String w;
    int i = 0;
    int j = 0;
    String spaces = "";
    
    System.out.println("Enter a string:");
    w = scan.nextLine();
    w += " ";
    
    while(i < w.length())
    {
      while(j <= i)
      {
        System.out.print(spaces + w.charAt(i));
        spaces += "\t";
        j++;
      }
      System.out.println();
      i++;
    }
    }
  }
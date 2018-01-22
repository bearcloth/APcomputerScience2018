/*
 * Lesson 10 Coding Activity Question 1
 * 
 * The following calculation will give roundoff error:
 *      double x = 1.473;
 *      System.out.println(2 - x);
 * 
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 * 
 * Sample run:
 * 
 *      Please enter two decimal values:
 *      2
 *      1.473
 *     
 *      The difference is: 0.527
 * 
 * Use this starter file as your template.
 * 
 */

import java.util.Scanner;
import java.lang.Math;


class Lesson_10_Activity {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      double val1, val2;
      
      System.out.println("Please enter two decimal values: ");
      
      val1 = scan.nextDouble();
      val2 = scan.nextDouble();
      
      int tmp1 = (int)Math.round(val1 * 1000);
      int tmp2 = (int)Math.round(val2 * 1000);
      
      System.out.println("The difference is: " + (1.0 * (tmp1 - tmp2) / 1000));
    }
}
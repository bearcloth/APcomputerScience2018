/*
 * Lesson 6 Coding Activity Question 2
 *
 * Input a double value and print only the integer part.
 *
 * Sample run:
 
Please input a decimal number:
57.8934
Answer: 57

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_6_Activity_Two {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        double d1;
        
        System.out.println("Please input a decimal number: ");
        
        d1 = scan.nextDouble();
        
        System.out.println("Answer: " + (int) d1);
    }
}
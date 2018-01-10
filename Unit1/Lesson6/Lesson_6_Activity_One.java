/*
 * Lesson 6 Coding Activity Question 1
 
double x = (11+4)/2
 
 * What answer do you get? The answer is imprecise!
 *
 * Write a Java program that precisely calculates the average 
 * between two integers that input from the keyboard, and prints 
 * the answer to the screen. The average must include the integer 
 * and decimal portions of the calculation.
 *
 * Sample Run:
 
Please enter two integers:
4
11

The average is: 7.5

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_6_Activity_One {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        int n1, n2;
        double avg;
        
        System.out.println("Please enter two integers: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        
        avg = (double)(n1 + n2) / 2;
        
        System.out.println("The average is: " + avg);
    }
}
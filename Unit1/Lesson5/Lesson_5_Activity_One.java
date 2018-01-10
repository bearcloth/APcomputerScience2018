/*
 * Lesson 5 Coding Activity Question 1
 * 
 * Input two double values and print the difference between them. 
 * (The difference can be found by subtracting the second value from the first).
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_One {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        double num1;
        double num2;
        double difference;
        
        System.out.println("Enter two doubles: ");
        
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        
        difference = num1 - num2;
        
        System.out.println(difference);
    }
}
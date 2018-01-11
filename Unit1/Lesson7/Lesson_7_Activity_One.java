/*
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_One {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        int n;
        
        System.out.println("Please enter a three digit number: ");
        
        n = scan.nextInt();
        
        System.out.println("Here are the digits: \n" + ((n / 100 % 10) + "\n" + (n / 10 % 10) + "\n" + (n % 10)));
    }
}
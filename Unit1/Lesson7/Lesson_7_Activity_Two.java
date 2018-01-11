/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_Two {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        int nFull;
        
        System.out.println("Please enter a three digit number: ");
        
        nFull = scan.nextInt();
        
        int nTho = nFull / 100 % 10;
        int nHun = nFull / 10 % 10;
        int nTen = nFull % 10;
        
        System.out.println("Here are the digits: \n" + nTho + "\n" + nHun + "\n" + nTen);
        System.out.println("\n" + nTho + " + " + nHun + " + " + nTen + " = " + (nTen + nHun + nTho));
    }
}
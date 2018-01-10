/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_Two {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        int n1, n2, n3, n4;
        int sum;
        
        System.out.println("Input 4 integer values: ");
        
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        n4 = scan.nextInt();
        
        sum = n1 + n2 + n3 + n4;
        
        System.out.println(sum);
    }
}
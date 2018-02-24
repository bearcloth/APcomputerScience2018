/*
 * Lesson 1011 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_1011_Activity{
  
  // returns the amount of numbers in the int
  public static int octalSize(int octalNum)
  {
    int count = 0;
    while(octalNum != 0)
    {
      octalNum /= 10;
      count++;
    }
    return count;
  }
  
  // checks if length is greater than 8
  public static void checkOctal(int num)
  {
    if(num > 8)
    {
      System.out.println("ERROR: Incorrect Octal Format");
      System.exit(0);
    }
  }
  
  // this checks that each individual number is between 0 - 7 and does octal -> decimal 
  public static void oToD(int octalNum, int num)
  {
    int[] nums = new int[num];
    int mod = 10;
    int div = 10;
    int tmp = octalNum;
    int sum = 1;
    int numPlace = 0;
    int mult = 1;
    
    for(int i = 0; i < nums.length; i++)
    {
      if(i == 0)
      {
        tmp = octalNum % mod;
        nums[i] = tmp;
        mod *= 10;
        continue;
      }
      
      tmp = octalNum % mod / div;
      
      mod *= 10;
      div *= 10;
      
      nums[i] = tmp;
    }
    
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] > 7 || nums[i] < 0)
      {
        System.out.println("ERROR: Incorrect Octal Format");
        System.exit(0);
      }
    }
    
    //where the conversion will begin
    for(int i = 0; i < nums.length; i++)
    {

      mult = nums[i] * (int)Math.pow(8, numPlace);
      sum += mult;
      numPlace++;
    }
    
    System.out.println(sum - 1);
   
  }
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a number in base 8: ");
    int octalNum = scan.nextInt();
    int num = octalSize(octalNum);
    
    checkOctal(num);
    
    // octal to decimal
    oToD(octalNum, num);
  }
}

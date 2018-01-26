/*
 * Lesson 14 Coding Activity 3
 * The Internet runs on web addresses.The addresses we type represent the IP address 
 * for each site and how the computer finds an individual web page.
 *
 * IP addresses are made up of four numbers, each between 0 and 255 separated by a period. 
 * For example, 128.253.21.58 is an IP address.
 * 
 * Write a program to enter four numbers and test if they make up a valid IP address.
 * In other words, test to see if the numbers entered are between 0 and 255 inclusive.
 * 
 *     Sample Run 1
 *         Please enter the first octet:
 *         898
 *         Please enter the second octet:
 *         34
 *         Please enter the third octet:
 *         712
 *         Please enter the fourth octet:
 *         45
 *         Octet 1 is incorrect
 *         Octet 3 is incorrect
 * 
 *         
 *      Sample Run 2
 *         Please enter the first octet:
 *         112
 *         Please enter the second octet:
 *         200
 *         Please enter the third octet:
 *         0
 *         Please enter the fourth octet:
 *         254
 *         IP Address: 112.200.0.254
 * 
 */


import java.util.Scanner;

class Lesson_14_Activity_Three {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int o1, o2, o3, o4;
    
    System.out.println("Please enter the first octet: ");
    o1 = scan.nextInt();
    
    System.out.println("Please enter the second octet: ");
    o2 = scan.nextInt();
    
    System.out.println("Please enter the third octet: ");
    o3 = scan.nextInt();
    
    System.out.println("Please enter the fourth octet: ");
    o4 = scan.nextInt();
    
    if((o1 >= 0 && o1 <= 255) && (02 >= 0 && o2 <= 255) && (o3 >= 0 && o3 <= 255) && (o4 >= 0 && o4 <= 255))
    {
      System.out.println("IP Address: " + o1 + "." + o2 + "." + o3 + "." + o4);
    }
    else
    {
      if(!(o1 >= 0 && o1 <= 255))
      {
        System.out.println("Octet 1 is incorrect");
      }
      if(!(o2 >= 0 && o2 <= 255))
      {
        System.out.println("Octet 2 is incorrect");
      }
      if(!(o3 >= 0 && o3 <= 255))
      {
        System.out.println("Octet 3 is incorrect");
      }
      if(!(o4 >= 0 && o4 <= 255))
      {
        System.out.println("Octet 4 is incorrect");
      }
    }
  }
}
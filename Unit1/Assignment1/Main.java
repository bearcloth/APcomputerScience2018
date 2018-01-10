import java.lang.Math;

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
   
    Scanner scan = new Scanner(System.in);
    
    int mrw1, mrw2, mrw3; // movie review website (3 of them)
    double fg1, fg2;      // focus group reviews (2 of them)
    double avgFG;         // average fogcus group rating
    double avgCR;         // average critic rating
    double avgWR;         // average website rating
    double omr;           // Overall movie rating
    double avgWR_W;       // weighted website review average 20%
    double avgFG_W;       // weighted focus group review average 30%
    double avgCR_W;       // weighted critic rating average 50%
    
    System.out.println("Please enter ratings from the movie review website.");
    
    mrw1 = scan.nextInt();
    mrw2 = scan.nextInt();
    mrw3 = scan.nextInt();
    
    System.out.println("Please enter ratings from the focus group.");
    
    fg1 = scan.nextDouble();
    fg2 = scan.nextDouble();
    
    System.out.println("Please enter the average movie critic rating.");
    
    avgCR = scan.nextDouble();
    
    avgWR = (double)((mrw1 + mrw2 + mrw3) / (double)3);
    avgFG = ((fg1 + fg2) / (double)2);
    
    avgWR_W = avgWR * .20;
    avgFG_W = avgFG * .30;
    avgCR_W = avgCR * .50;
    
    omr = (double)(avgCR_W + avgWR_W + avgFG_W);
    
    System.out.println("Average website rating: " + avgWR);
    System.out.println("Average focus group rating: " + avgFG);
    System.out.println("Average movie critic rating: " + avgCR);
    System.out.println("Overall movie rating: " + omr);
  }
}
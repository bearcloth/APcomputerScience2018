import java.lang.Math;
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int seconds;
    int year, month, day, hour, min, sec;
    int sYear  = 31104000;
    int sMonth = 2592000;
    int sDay   = 86400;
    int sHour  = 3600;
    int sMin   = 60;
    
    System.out.println("Seconds since Unix Epoch: ");
    
    seconds = scan.nextInt();
    
    year = seconds / sYear;
    year += 1970;
    seconds %= sYear;
    
    month = seconds / sMonth;
    seconds %= sMonth;
    
    day = seconds / sDay;
    seconds %= sDay;
    
    hour = seconds / sHour;
    seconds %= sHour;
    
    min = seconds / sMin;
    seconds %= sMin;
    
    sec = seconds;
    
    System.out.println("Year: " + year + "\nMonth: " + month + "\nDay: " + day + "\nHour: " + hour +"\nMin: " + min + "\nSec: " + sec);
    
  }
}
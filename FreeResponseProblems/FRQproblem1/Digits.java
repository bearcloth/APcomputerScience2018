import java.util.*;

public class Digits
{
  private ArrayList<Integer> digits;
  
  public Digits(int num)
  {
    digits = new ArrayList<Integer> ();
    digits.add(0, new Integer(num % 10));
    
    int numCheck = num / 10;
    while(numCheck > 0)
    {
      digits.add(0, new Integer(numCheck % 10));
      numCheck /= 10;
    }
  }
  
  public boolean isStrictlyIncreasing()
  {
    for(int second = 1; second < digits.size() - 1; second++)
    {
      int first = second - 1;
      if(digits.get(first) >= digits.get(second))
        return false;
    }
    return true;
  }
}
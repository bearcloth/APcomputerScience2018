/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 2: FreightTrain
 * A class which represents a freight train with multiple boxcars.
 */

import java.util.ArrayList;

public class FreightTrain
{
  // An ArrayList that stores a train with multiple boxcars
  private ArrayList<Boxcar> train = new ArrayList<Boxcar>();
  
  // Default constructor that sets train to an ArrayList holding one
  // boxcar containing 5 gizmos, that is not in repair.
  public FreightTrain()
  {
    this(1);
  }
  
  // A constructor that sets train to an ArrayList of size n, holding
  // n boxcars, that are all hold 5 gizmos and are not in repair. If n <= 0,
  // then the train should be set to size one, with a single boxcar containing
  // 5 gizmos and not in repair.
  public FreightTrain(int n)
  {
    if(n <= 0)
      n = 1;
    
    for(int i = 0; i < n; i++)
      train.add(new Boxcar());
    
  }
  
  // This method returns a String representation of the
  // Boxcar objects in the ArrayList, one per line. For example,
  // here is the String returned when toString is called on a
  // FreightTrain with 5 boxcars:
  //
  // 3 gadgets    in service
  // 2 wadgets    in service
  // 0 gizmos    in repair
  // 7 gadgets    in service
  // 0 gadgets    in repair
  //
  // Note: there is one space between the number of units and
  // the cargo type, and a tab between the cargo type and
  // "in repair"/"in service".
  public String toString()
  {
  
    String output = "";
    for(Boxcar c: train)
    {
      output += c.toString();
    }
    return output;
  }
  
  // This method sets the cargo type of all the boxcars in the entire train.
  public void setCargo(String c)
  {
    for(Boxcar i: train)
    {
      i.setCargo(c);
    }
  }
  
  // This method sets the boxcars to the pattern "gizmos", "gadgets", "widgets",
  // "wadgets", "gizmos", "gadgets", "widgets", "wadgets", ...
  // until the end of the train.
  public void setMultiCargo()
  {
    String[] cargoTypes = {"gizmos", "gadgets", "widgets", "wadgets"};
    
    int counter = 0;
    for(Boxcar c: train)
    {
      if(counter % 4 == 0)
        c.setCargo(cargoTypes[0]);
      else if(counter % 4 == 1)
        c.setCargo(cargoTypes[1]);
      else if(counter % 4 == 2)
        c.setCargo(cargoTypes[2]);
      else if(counter % 4 == 3)
        c.setCargo(cargoTypes[3]);
      
      counter++;
    }
    
  }
  
  // This method fills every boxcar in the train to max capacity of 10.
  // Each individual boxcar can only hold cargo if its
  // repair variable is false.
  public void fillTrain()
  {
    for(Boxcar c: train)
    {
      for(int i = 0; i < 10; i++)
        c.loadCargo();
    }
  }
  
  // This method sets the Boxcar at location i’s repair variable to true.
  public void callForRepair(int i)
  {
    train.get(i).callForRepair();
  }
}

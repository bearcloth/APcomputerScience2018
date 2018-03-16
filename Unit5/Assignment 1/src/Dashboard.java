
public class Dashboard {

	private int odometer;
    private int speedometer;
    private boolean checkEngine; // on / off

    public Dashboard()
    {
    	odometer = 0;
    	speedometer = 0;
    	checkEngine = false;
    }

    public Dashboard(int milesTravelled, int speed)
    {
    	if((milesTravelled >= 0 && milesTravelled <= 99999) && (speed >= 0 && speed <= 100))
    	{
    		odometer = milesTravelled;
    		speedometer = speed;
    		checkEngine = false;
    	}
    	else if(!(milesTravelled >= 0 && milesTravelled <= 99999) && (speed >= 0 && speed <= 100))
    	{
    		odometer = 0;
    		speedometer = speed;
    		checkEngine = true;
    	}
    	else if((milesTravelled >= 0 && milesTravelled <= 99999) && !(speed >= 0 && speed <= 100))
    	{
    		odometer = milesTravelled;
    		speedometer = 0;
    		checkEngine = true;
    	}
    	else
    	{
    		checkEngine = true;
    	}
    	
    }

    public String toString()
    {
        String str_speed = "Speedometer: " + speedometer + " MPH\n";
        String str_odom = "Odometer: " + String.format("%05d", odometer) + "\n";
        String str_engine;
        if(checkEngine == true)
        	str_engine = "Check Engine: On";
        else
        	str_engine = "Check Engine: Off";
            
        return str_speed + str_odom + str_engine;
    }

    public void accelerate()
    {
    	speedometer++;
    	
        if(speedometer > 100)
        {
        	speedometer = 0;
        	checkEngine = true;
        }
    }

    public void drive(int numMinutes)
    {  
    	if(numMinutes <= 720)
    	{
    		double hour = numMinutes / 60.0;
    		odometer += hour * speedometer;
    	}
    	
        if(odometer > 99999)
        {
        	odometer = 0;
        	checkEngine = true;
        }
        
    }
}

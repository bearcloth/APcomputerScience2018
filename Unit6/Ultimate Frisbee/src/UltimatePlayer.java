
public class UltimatePlayer extends Person
{

	private static int jerseyNumber = 0;
	private int counter = 0;
	private String position;

	public UltimatePlayer(String fn, String ln, String position)
	{
		super(fn, ln);
		
		jerseyNumber++;
		counter = jerseyNumber;
		
		if(position.equals("handler"))
			this.position = "handler";
		else if(position.equals("cutter"))
			this.position = "cutter";
		else
			this.position = "handler";
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public String toString()
	{
		return super.toString() + "   Jersey #: " + counter + "\n" + "   Position: " + position + "\n";
	}

}

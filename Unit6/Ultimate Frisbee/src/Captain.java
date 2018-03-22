
public class Captain extends UltimatePlayer
{

	// true -> offense   false -> defense
	private boolean type;
	
	public Captain(String fn, String ln, String position, boolean t)
	{
		super(fn, ln, position);
		type = t;
	}
	
	public String toString()
	{
		String ofOrDe = "";
		if(type == true)
			ofOrDe += "offense\n";
		else if(type == false)
			ofOrDe += "defense\n";
		
		return super.toString() + "   Captain: " + ofOrDe;
	}

}

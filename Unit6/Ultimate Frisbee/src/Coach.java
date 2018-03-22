
public class Coach extends Person
{

	private String role;
	
	public Coach(String fn, String ln, String r)
	{
		super(fn, ln);
		role = r;
	}
	
	public String toString()
	{
		return super.toString() + "   Role: " + role + "\n";
	}

}

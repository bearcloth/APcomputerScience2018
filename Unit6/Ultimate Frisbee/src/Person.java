
public class Person
{
	private String firstName;
	private String lastName;
	
	public Person(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
	}
	
	public String toString()
	{
		return lastName + ", " + firstName + "\n";
	}
}

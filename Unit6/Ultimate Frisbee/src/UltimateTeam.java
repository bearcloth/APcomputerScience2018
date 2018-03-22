import java.util.ArrayList;

public class UltimateTeam
{
	ArrayList<UltimatePlayer> players;
	ArrayList<Coach> coaches;
	
	public UltimateTeam(ArrayList<UltimatePlayer> p, ArrayList<Coach> c)
	{
		this.players = p;
		this.coaches = c;
	}
	
	public String getCutters()
	{
		String cutter_str = "";
		
		for(UltimatePlayer p : players)
		{
			if(p.getPosition() == "cutter")
			{
				cutter_str += p.toString();
			}
		}
		
		if(cutter_str.length() == 0)
			return "";
		
		return cutter_str;
	}
	
	public String getHandlers()
	{
		String handler_str = "";
		
		for(UltimatePlayer p: players)
		{
			if(p.getPosition() == "handler")
			{
				handler_str += p.toString();
			}
		}
		
		if(handler_str.length() == 0)
			return "";
		
		return handler_str;
	}
	
	public String toString()
	{
		String coaches_str = "";
		String players_str = "";
		
		for(Coach c : coaches)
		{
			coaches_str += c.toString();
		}
		
		for(UltimatePlayer p : players)
		{
			players_str += p.toString();
		}
		
		return "COACHES\n" + coaches_str + "\nPLAYERS\n" + players_str;
	}
}

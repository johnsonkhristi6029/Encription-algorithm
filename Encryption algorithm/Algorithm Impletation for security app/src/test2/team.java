package test2;

public class team {
	
	String t_id="";
	String date_from="";
	String date_to="";
	String[] agents = new String[10];;
	String[] team_agents= new String[10];
	
	
	public void setT_id(String t_id) 
	{
       	this.t_id = t_id;
    }
 	public void getDate_from(String date_from) 
	{
       	this.date_from = date_from;
    }
	public void getDate_to(String date_to)
	{
       	this.date_to = date_to;
    }
 	public void getAgents(String[] agents) 
	{
      	this.agents = agents;
    }
	public void setTeam_agents(String[] team_agents ) 
	{
		this.team_agents = team_agents;
    }
 	
 

}


public class Player {
	private String username;   // name of player and username 
	private String password;	// password for player
	private double money;		//amount of money of player
	
	public Player(String username,String password, double money)
	{
		this.username = username;
		this.password = password;
		this.money = money;
	}
	public void setUsername(String user)
	{
		this.username = user;
	}
	public String getUsername()
	{
		return username;
	}
	public void setPassword(String pasword)
	{
		password = pasword;
	}
	public String getPassword()
	{
		return password;
	}
	public double getCurrentMoney()
	{
		return money;
	}
	public String toString()
	{
		return username + " " + password +" " + money;
	}
}

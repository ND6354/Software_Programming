import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Playersize {
	private int numPlayers;
	private Player[] players;
	//private Card[] hand;
	
	public Playersize() {
	numPlayers = 0;
	players = new Player[6]; //max size of player for game = 6
	}
	/*
	public Card[] gethand() // get the card(s) in hand
	{
		return handsize;
	}
	*/
	//Function add new players
	public void addNewPlayer(String username, String password ,double money)
	{
		if(numPlayers > players.length)
		{
			System.out.println("Maximum player has been reached");
		}else {
		players[numPlayers] = new Player(username, password, 500);
		numPlayers++;
		}
	}
	//Function add player who played before
	public void addOldPlayer(String username, String password, String filename)
	{
		//search through text file and check if username and password if correct
		//add username , password, money to game
	try {
		File file = new File(filename);
		Scanner load = new Scanner(file);
		while(load.hasNext()) {
			String str = load.nextLine();
			String[] token = str.split(" ");
			String user = token[0];
			String pasword = token[1];
			String money = token[2];
			if(token[0] == username && token[1] == password)
			{
			players[numPlayers] = new Player (user, pasword, Integer.parseInt(money));
			numPlayers++;
			break;
			}
		}
	
		load.close();
	} catch (FileNotFoundException e) {
		System.out.println("Could not find");
	}
	
	}
	//Removes a player and save player info to a text file on desktop
	public void removePlayer(String Username)
	{
		for(int i = 0; i < numPlayers; i++)
		{
			if(players[i].getUsername() == Username)
			{
				// file in desktop creation
				String Desktop = System.getProperty("user.home");
				File file = new File(Desktop, "test.txt");
				//player info to text file
				try {
					PrintWriter pr;
					pr = new PrintWriter(file);
					pr.println(players.toString());
					pr.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//remove player
				players[i] = players[numPlayers - 1];
				numPlayers--;
			}
		}
	}
	
}

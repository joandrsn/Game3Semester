package game;

import java.util.ArrayList;
import java.io.*;

import model.Player;

public class Game {

	/**
	 * @param args
	 *
	 */
	public static ArrayList<Player> players;
	public static Player me;
	
	public static void main(String[] args) throws Exception {
	
		System.out.println("Indtast dit spillernavn");
		BufferedReader b = new BufferedReader (new InputStreamReader(System.in));
		String in = b.readLine();
		 
		players = new ArrayList<Player>();
		me = new Player(in);
		players.add(me);
		players.add(new Player("FUP"));
		
		ScoreList s = new ScoreList(players);
		s.setVisible(true);
		GamePlayer g = new GamePlayer(me,s,players);
	}

}
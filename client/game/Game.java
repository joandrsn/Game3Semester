package game;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import network.ConnectionService;
import service.ClientService;

public class Game {

	/**
	 * Method for starting the network game
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Please input your player name:");
		BufferedReader b = new BufferedReader (new InputStreamReader(System.in));
		String name = b.readLine();
		 
		System.out.println("\n Thank you! Now creating your player");
		ClientService clientService = ClientService.getInstance();
		clientService.createMePlayer(name);
		
		System.out.println("\n Player created. Please input the ip of the server:");
		String ip = b.readLine();
		ConnectionService connectService = ConnectionService.getInstance();
		connectService.initConnection(ip);
		
		Screen s = new Screen();
	}

}

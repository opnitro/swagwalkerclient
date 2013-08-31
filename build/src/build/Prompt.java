package build;

import java.io.IOException;
import java.util.Scanner;

public class Prompt {

	public void start() throws IOException{
		//String for holding input
		String input;
		//Objects
		Scanner scanner = new Scanner(System.in);
		Database database = new Database();
		Input in = new Input();
		//String for user
		String user;
		int points;
		System.out.println("Enter command: ");
		input = scanner.nextLine();
		
		if(input.equals("adduser")){
			//TODO
			//Change confirm.name to input.getName, 
			//and make confirm just have one method that works for all variables
			user = in.getName();
			System.out.println(user);
			database.addUser(user);
		}else if(input.equals("addpoints")){
			user = in.getName();
			points = in.getPoints();
			database.addPoints(user, points)
		}else if(input.equals("compile")){
			datebase.compile();
		}else if(input.equals("quit")){
			break;
		}else{
			System.out.println("Invalid Command");
			start();
		} */
		
		
	}
	
	
	
	
	
	
}

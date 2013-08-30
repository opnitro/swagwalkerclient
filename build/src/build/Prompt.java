package build;

import java.util.Scanner;

public class Prompt {

	public void start(){
		//String for holding input
		String input;
		//Create a new scanner object
		Scanner scanner = new Scanner(System.in);
		//String for user
		String user;
		int points;
		System.out.println("Enter command: ");
		input = scanner.nextLine();
		
		if(input.equals("adduser")){
			user = confirm.name();
			database.add(user);
		}
		else if(input.equals("removeuser")){
			user = confirm.name();
			database.remove(user);
		}else if(input.equals("addpoints")){
			user = confirm.user();
			points = confirm.points();
			database.addPoints(user, points)
		}else if(input.equals("compile")){
			datebase.compile();
		}else if(input.equals("quit")){
			break;
		}else{
			System.out.println("Invalid Command");
			start();
		}
		
		
	}
	
	
	
	
	
	
}

package build;

import java.util.Scanner;

public class Prompt {

	public void start(){
		//String for holding input
		String input;
		//Objects
		Scanner scanner = new Scanner(System.in);
		Database database = new Database();
		Confirm confirm = new Confirm();
		//String for user
		String user;
		int points;
		System.out.println("Enter command: ");
		input = scanner.nextLine();
		
		if(input.equals("adduser")){
			//TODO
			//Change confirm.name to input.getName, 
			//and make confirm just have one method that works for all variables
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

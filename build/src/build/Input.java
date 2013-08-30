package build;
import java.util.Scanner;
public class Input {
private Scanner scanner = new Scanner(System.in);
private String answer;
	public String getName(){
		String name = null;
		boolean x = true;
		while(x){
			System.out.println("Enter user: ");
			name = scanner.nextLine();
			System.out.println("Is "+name+" correct");
			answer = scanner.nextLine();
			
		}
		
		
		return name;
	}
		
	
	
	
	
}

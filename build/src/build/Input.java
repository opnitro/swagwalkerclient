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
			System.out.println("Is "+name+" correct(y/n)");
			answer = scanner.nextLine();
			if(answer.equals("y")){
				x = false;
			}else{
				x = true;
			}
				
		}
		
		
		return name;
	}
	
	public int getPoints(){
		int x;
		boolean y = true;
		while(y){
			System.out.println("Enter the amount of points");
			answer = scanner.nextLine();
			
			
			
		}
		x = Integer.parseInt(answer);
		
		return x;
	}
		
	
	
	
	
}

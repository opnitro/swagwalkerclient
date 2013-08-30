package build;

import java.util.Scanner;

public class Confirm {
	private String[] ansArray = {"y", "n"};
	public String name(String x){
		Scanner scanner = new Scanner(System.in);
		String ans;
		System.out.println("Is "+x+" correct? (y/n)");
		ans = scanner.nextLine();
		if(ans.equals(arg0))
		return x;
	}
	
	
	
}

package build;

import java.util.Scanner;
import java.io.*;
public class Database {

	private Scanner scanner = new Scanner(System.in);
	
	
	public void addUser(String x) throws IOException{
		FileWriter fw = new FileWriter("/Users/aaron/git/swagwalkerclient/test/test.txt");
		PrintWriter output = new PrintWriter(fw);
		
		output.print(x);
		
		output.close();
		fw.close();
		
		
		
	}
	
	
	
}

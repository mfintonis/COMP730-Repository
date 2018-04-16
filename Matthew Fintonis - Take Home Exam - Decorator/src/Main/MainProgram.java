package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainProgram {
	public static void main(String [] args) throws IOException {
		//BufferedReader reader = new VerbDecorator(new AdjectiveDecorator(new AdverbDecorator(new FileReader(new File("File01.txt")))));
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("File01.txt")));
		BaseReader reader = new BaseReader(bufferedReader);
		
		System.out.println("Results of parsing File01.txt:\n");
		
		String line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
		
		
		System.out.println("\n****************");
		System.out.println("****************\n");
		
		bufferedReader = new BufferedReader(new FileReader(new File("File02.txt")));
		reader = new BaseReader(bufferedReader);
		
		System.out.println("Results of parsing File02.txt:\n");
		
		line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
	}
}

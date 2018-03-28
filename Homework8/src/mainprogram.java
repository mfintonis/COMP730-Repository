//Programmed by: Matthew Fintonis

import java.util.Scanner;

public class mainprogram {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Fibonacci fib = new Fibonacci();
		int readNum = 0;
		while(true) {
			System.out.println("Enter a number for the fibonacci sequence or enter \"q\" to quit");
			System.out.print("Input: ");
			
			String strInput = scanner.nextLine();
			
			if(strInput.toLowerCase().equals("q")) {
				break;
			}
			try {
				readNum = Integer.valueOf(strInput);
				System.out.println("Result: " + fib.GetResultFromIndex(readNum));
			}
			catch(Exception e){
				System.out.println("Invalid Input!");
			}
		}
		
		scanner.close();
		
		System.out.print("Program Ending.");
	}
}

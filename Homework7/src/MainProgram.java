import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		StateMachine stateMachine = new StateMachine();

		Scanner reader = new Scanner(System.in);
		boolean finished = false;
		
		while (!finished) {
			System.out.println("Input a, b, or c. Enter 'current' for current state. Enter 'quit' to quit.");
			String strInput = reader.nextLine();

			switch(strInput.toLowerCase()) {
			case "a":
				stateMachine.StateA();
				break;
			case "b":
				stateMachine.StateB();
				break;
			case "c":
				stateMachine.StateC();
				break;
			case "current":
				stateMachine.GetCurrentState();
				break;
			case "quit":
				finished = true;
				break;
			default:
				System.out.println("Invalid input.");
			}
		}
		System.out.println("Quitting Program.");
		reader.close();
	}

}

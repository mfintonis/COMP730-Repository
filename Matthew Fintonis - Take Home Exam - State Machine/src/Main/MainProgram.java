package Main;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		StateMachine stateMachine = new StateMachine();

		Scanner reader = new Scanner(System.in);
		boolean finished = false;
		
		while (!finished) {
			System.out.println("Input a number for a command.");
			System.out.println("1. Service Disabled By User");
			System.out.println("2. Service Enabled");
			System.out.println("3. Health Check Is Good");
			System.out.println("4. Service Health Check Times Out");
			System.out.println("5. Health Check Is Bad");
			System.out.println("6. Check Current State");
			System.out.println("7. Quit Program\n");
			System.out.print("Command: ");
			
			int input = reader.nextInt();

			switch(input) {
			case 1:
				stateMachine.StateServiceDisabledByUser();
				break;
			case 2:
				stateMachine.StateServiceEnabled();
				break;
			case 3:
				stateMachine.StateHealthCheckIsGood();
				break;
			case 4:
				stateMachine.StateServiceHealthCheckTimesOut();
				break;
			case 5:
				stateMachine.StateHealthCheckIsBad();
				break;
			case 6:
				stateMachine.GetCurrentState();
				break;
			case 7:
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

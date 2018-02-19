import java.util.Scanner;

public class GameController {

	public void Run() {
		Scanner sc = new Scanner(System.in);
		QuitCommand quit = new QuitCommand();
		HelpCommand help = new HelpCommand();
		
		while(true) {
			System.out.print("Enter your command: ");
			String input = sc.nextLine();
			
			if(help.matchCommand(input)) {
				help.doCommand();
				continue;
			}
			
			if(quit.matchCommand(input)) {
				quit.doCommand();
				continue;
			}
			
			System.out.println("Invalid input. Type in 'help' for a list of commands");
		}
	}
	
}


public class HelpCommand implements Commandable {

	public boolean matchCommand(String input) {
		
		return input.toLowerCase().equals("help");
	}

	public void doCommand() {
		System.out.println("List of Commands");
		System.out.println("-----------------");
		System.out.println("Help - Displays this menu");
		System.out.println("Quit - Quits the program");
	}

}

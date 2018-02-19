
public class QuitCommand implements Commandable {

	public boolean matchCommand(String input) {
		
		return input.toLowerCase().equals("quit");
	}

	public void doCommand() {
		System.out.println("Quitting program...");
		System.exit(0);
	}
	
}
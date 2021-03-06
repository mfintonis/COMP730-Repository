package Main;

import java.io.IOException;
import java.io.Reader;
import java.util.Random;

public class AdjectiveDecorator extends AdverbDecorator {

	private String[] arrOfAdjectives = { "random", "red", "tall", "short", "young", "smart", "old", "metallic", "large", "tiny" };
	
	//This has to be public for the test case to access it. I think this is because they are in separate packages.
	public int index = -1;
	
	public AdjectiveDecorator(Reader reader) {
		super(reader);
	}
	
	public AdjectiveDecorator(Reader reader, int startingIndex) {
		super(reader, startingIndex);
		index = startingIndex;
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		
		if(line != null) {
			while(line.contains("<<ADJECTIVE>>")) {
				line = line.replaceFirst("<<ADJECTIVE>>", GetAdjective());
			}
		}
		
		return line;
	}
	
	private String GetAdjective() {
		if(index < 0) {
			Random rnd = new Random();
			index = rnd.nextInt(10);
		}
		
		index++;
		if(index >= arrOfAdjectives.length) {
			index = 0;
		}
		return arrOfAdjectives[index];
	}
	
}

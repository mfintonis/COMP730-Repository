package Main;

import java.io.IOException;
import java.io.Reader;
import java.util.Random;

public class VerbDecorator extends AdjectiveDecorator {

	private String[] arrOfVerbs = { "shriek", "fight", "cook", "command", "damage", "impress", "lecture", "memorize", "pop", "whisper" };
	
	//This has to be public for the test case to access it. I think this is because they are in separate packages.
	public int index = -1;
	
	public VerbDecorator(Reader reader) {
		super(reader);
	}
	
	public VerbDecorator(Reader reader, int startingIndex) {
		super(reader, startingIndex);
		index = startingIndex;
	}

	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		
		if(line != null) {
			while(line.contains("<<VERB>>")) {
				line = line.replaceFirst("<<VERB>>", GetVerb());
			}
		}
		
		return line;
	}
	
	private String GetVerb() {
		if(index < 0) {
			Random rnd = new Random();
			index = rnd.nextInt(10);
		}
		
		index++;
		if(index >= arrOfVerbs.length) {
			index = 0;
		}
		return arrOfVerbs[index];
	}
	
}

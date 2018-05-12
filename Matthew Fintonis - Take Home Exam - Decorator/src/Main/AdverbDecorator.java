package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Random;

public class AdverbDecorator extends BufferedReader {

	private String[] arrOfAdverbs = { "awkwardly", "briskly", "carefully", "effortlessly", "happily", "lazily", "really", "worriedly", "slowly", "quickly" };
	
	//This has to be public for the test case to access it. I think this is because they are in separate packages.
	public int index = -1;
	
	public AdverbDecorator(Reader reader) {
		super(reader);
	}
	
	public AdverbDecorator(Reader reader, int startingIndex) {
		super(reader);
		index = startingIndex;
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		
		if(line != null) {
			while(line.contains("<<ADVERB>>")) {
				line = line.replaceFirst("<<ADVERB>>", GetAdverb());
			}
		}
		
		return line;
	}
	
	private String GetAdverb() {
		if(index < 0) {
			Random rnd = new Random();
			index = rnd.nextInt(10);
		}
		
		index++;
		if(index >= arrOfAdverbs.length) {
			index = 0;
		}
		return arrOfAdverbs[index];
	}
	
}

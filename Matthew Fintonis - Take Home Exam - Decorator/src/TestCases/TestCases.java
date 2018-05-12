package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import Main.AdjectiveDecorator;
import Main.AdverbDecorator;
import Main.VerbDecorator;

class TestCases {
	//Test only the Adverb Decorator with a random index
	@Test
	void TestAdVerb() throws IOException {
		String[] arrOfAdverbs = { "awkwardly", "briskly", "carefully", "effortlessly", "happily", "lazily", "really", "worriedly", "slowly", "quickly" };
	
		AdverbDecorator reader = new AdverbDecorator(new BufferedReader(new FileReader(new File("File01.txt"))));		
		
		String comparison = "";
		String line = reader.readLine();
		while(line != null) {
			comparison += line;
			line = reader.readLine();
		}
		
		int index = reader.index;
		
		reader.close();
		
		assertEquals(comparison, "The <<ADJECTIVE>> door was still open, just a little, where the knife and the man who held it had <<VERB>>ed in, and wisps of <<ADJECTIVE>> mist <<VERB>>ed " + arrOfAdverbs[index] + " and twined into the house through the <<ADJECTIVE>> door. ");
	}
	
	//Test all with predetermined indexes
	@Test
	void TestAllWithKnownIndex() throws IOException {
		VerbDecorator reader = new VerbDecorator(new AdjectiveDecorator(new AdverbDecorator(new BufferedReader(new FileReader(new File("File02.txt"))))), 3);
		reader.index = 9;
		
		String comparison = "";
		String line = reader.readLine();
		while(line != null) {
			comparison += line;
			line = reader.readLine();
		}
		
		reader.close();
		
		assertEquals(comparison, "The young smart fox shrieked over the old dog. The dog just fighted happily all day without a care in the metallic world. ");
	}
}

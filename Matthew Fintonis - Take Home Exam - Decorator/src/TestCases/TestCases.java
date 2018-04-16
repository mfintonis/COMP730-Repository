package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import Main.AdjectiveDecorator;
import Main.AdverbDecorator;

class TestCases {

	@Test
	void TestAdjective() throws IOException {
		AdjectiveDecorator adjDec = new AdjectiveDecorator(new BufferedReader(new FileReader(new File("File01.txt"))));
		adjDec.index = 10;
		
		String comparison = "";
		String line = adjDec.readLine();
		while(line != null) {
			comparison += line;
			line = adjDec.readLine();
		}
		
		adjDec.close();
		
		assertEquals(comparison, "The random door was still open, just a little, where the knife and the man who held it had <<VERB>>ed in, and wisps of red mist <<VERB>>ed <<ADVERB>> and twined into the house through the tall door. ");
	}
	
	@Test
	void TestAll() throws IOException {
		AdverbDecorator advDec = new AdverbDecorator(new BufferedReader(new FileReader(new File("File02.txt"))));
		advDec.index = 10;
		
		String comparison = "";
		String line = advDec.readLine();
		while(line != null) {
			comparison += line;
			line = advDec.readLine();
		}
		
		advDec.close();
		
		assertEquals(comparison, "The <<ADJECTIVE>> <<ADJECTIVE>> fox <<VERB>>ed over the <<ADJECTIVE>> dog. The dog just <<VERB>>ed awkwardly all day without a care in the <<ADJECTIVE>> world. ");
	}

}

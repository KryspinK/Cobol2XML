package CobolTests;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.Token;
import parse.tokens.Word;

public class test {

	Token token = new Token("caf");
	String s = "sam";
	Word word = new Word();
	
	
	@Test
	public void test() {
		
		
		assertTrue(token.isWord());
		
		
		
	}

}

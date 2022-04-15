package CobolTests;

import static org.junit.Assert.*;
import parse.tokens.Token;

import org.junit.Test;

public class TokenTest {

	@Test
	public void test() {
		char c = 'a';
		Token t = new Token(c);
		assertFalse(t.isNumber());
		assertFalse(t.isWord());
		assertTrue(t.isSymbol());
	}

}

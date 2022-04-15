package CobolTests;

import static org.junit.Assert.*;
import parse.tokens.Literal;
import parse.tokens.Token;

import java.util.ArrayList;

import org.junit.Test;

public class LiteralTest {

	@Test
	public void test() {
		Literal c = new Literal("test");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = c.randomExpansion(2, 1);
		assertTrue(arrayList.isEmpty());
	}

}

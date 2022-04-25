package CobolTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import parse.tokens.QuotedString;

public class QuotedStringTest {

	@Test
	public void test() {
		QuotedString q = new QuotedString();
		
		int maxDepth = 2;
		int depth = 1;
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList = q.randomExpansion(maxDepth, depth);
		
		assertFalse(arrayList.isEmpty());
	}

}

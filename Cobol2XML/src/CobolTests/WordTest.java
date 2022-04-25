package CobolTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import parse.tokens.Word;

public class WordTest {

	@Test
	public void test() {
		Word w = new Word();
		int maxDepth = 2;
		int depth = 1;
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList = w.randomExpansion(maxDepth, depth);
		
		assertFalse(arrayList.isEmpty());
		
	}

}

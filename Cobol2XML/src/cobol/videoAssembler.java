package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class videoAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		
		
		Token t = (Token) a.pop();
		c.setVidExtension( t.sval());
		
		t = (Token) a.pop();
		c.setVidSize( t.nval());
		
		t = (Token) a.pop();
		c.setVidLength((int) t.nval());

		t = (Token) a.pop();
		c.setVidName(t.sval());
		
		t = (Token) a.pop();
		// this one is the video flag
		
		a.setTarget(c);
		
	}

}

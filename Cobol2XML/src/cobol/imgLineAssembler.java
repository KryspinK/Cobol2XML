package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class imgLineAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		Cobol c = new Cobol();
		
		Token t = (Token) a.pop();
		
		
		c.setImgSize( (int) t.nval());
		
		t = (Token) a.pop();
		
		c.setImgHeight( (int) t.nval());
		
		t = (Token) a.pop();
		
		c.setImgWidth( (int) t.nval());
		
		
		t = (Token) a.pop();
		c.setImgExtension(t.sval());
		
		t = (Token) a.pop();
		c.setImgName(t.sval());
		
		t = (Token) a.pop(); // IMG Flag
		
		a.setTarget(c);
	}

}

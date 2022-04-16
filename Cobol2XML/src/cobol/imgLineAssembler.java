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
		
		c.setMinImgCreated(t.nval());
		
		t = (Token) a.pop();
		
		c.setHourImgCreated(t.nval());
		
		t = (Token) a.pop();
		
		c.setYearImgCreated(t.nval());
		
		t = (Token) a.pop();
		
		c.setMonthImgCreated(t.sval());
		
		t = (Token) a.pop();
		
		c.setDayImgCreated(t.nval());
		
		t = (Token) a.pop();
		
		c.setFileSize(t.nval());
		
		t = (Token) a.pop();
		
		c.setImgHeight(t.nval());
		
		t = (Token) a.pop();
		
		c.setImgWidth(t.nval());
		
		t = (Token) a.pop();
		
		c.setImgExtension(t.sval());
		
		t = (Token) a.pop();
		
		System.out.println(t.sval());
		
		c.setImgName(t.sval());
		
		t = (Token) a.pop(); // Image Tag
		
		a.setTarget(c);
	}

}

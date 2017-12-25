package textbook;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class TextAreaExam extends Frame{
	public TextAreaExam(){
		super("TextArea");
		Panel p = new Panel();
		TextArea ta1 = new TextArea("first",3,30);
		TextArea ta2 = new TextArea("second",6,10,TextArea.SCROLLBARS_NONE);
		p.add(ta1);
		p.add(ta2);
		add(p);
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaExam();
	}
}

package textbook;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;

public class ChoiceExam extends Frame{
	public ChoiceExam(){
		super("Choice 테스트");
		Panel p = new Panel();
		Choice ch = new Choice();
		
		ch.addItem("봄");
		ch.addItem("여름");
		ch.addItem("가을");
		ch.addItem("겨울");
		
		p.add(ch);
		add(p);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ChoiceExam();
	}
}

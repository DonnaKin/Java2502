package textbook;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class LabelExam extends Frame{
	public LabelExam(){
	super("Label");
	Panel p = new Panel();
	
	Label label1 = new Label("레이블1");
	Label label2 = new Label("레이블2",Label.CENTER);
	Label label3 = new Label("레이블3",Label.LEFT);
	Label label4 = new Label("레이블4",Label.RIGHT);
	
	label1.setBackground(Color.yellow);
	label2.setBackground(Color.blue);
	label3.setBackground(Color.black);
	label4.setBackground(Color.white);
	p.add(label1);
	p.add(label2);
	p.add(label3);
	p.add(label4);
	add(p);
	setSize(300,100);
	setVisible(true);
	}
	public static void main(String[] args) {
		new LabelExam();
	}
}

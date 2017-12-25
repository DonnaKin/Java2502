package textbook;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class ButtonExam extends Frame{
	public ButtonExam(){
		super("버튼");//제목으로 띄움
		Panel p = new Panel();
		Button b1 = new Button("버튼1");
		Button b2 = new Button();
		b2.setLabel("버튼2");
		
		p.add(b1);
		p.add(b2);
		add(p);
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonExam();
	}
}

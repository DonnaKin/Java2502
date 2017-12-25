package textbook;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class ChoiceExam2 extends Frame{
	public ChoiceExam2(){
		super("ChoiceExam2 테스트");
		Panel p = new Panel();
		Choice ch_month = new Choice();
		Label label1 = new Label("월");
		
		Choice ch_day=  new Choice();
		Label label2 = new Label("일");
		
		for(int a=1;a<=12;a++)
			ch_month.addItem(Integer.toString(a));
		for(int i=1;i<=31;i++)
			ch_day.addItem(Integer.toString(i));
		
		p.add(ch_month); p.add(label1);
		p.add(ch_day); p.add(label2);
		add(p);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ChoiceExam2();
	}
}

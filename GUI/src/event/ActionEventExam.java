package event;

import java.awt.*;
import java.awt.event.*;
public class ActionEventExam extends Frame implements ActionListener{
	Button b1 = new Button("¹öÆ°");
	Panel p = new Panel();
	public ActionEventExam(){
		super("ActionEvent");
		p.add(b1);
		add(p);
		setSize(300,150);
		setVisible(true);
		
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new ActionEventExam();

	}

}

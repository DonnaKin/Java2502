package event;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ActionEventExam_2 extends JFrame implements ActionListener{
	JButton b1 = new JButton("¹öÆ°");
	JPanel p = new JPanel();
	public ActionEventExam_2(){
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
		new ActionEventExam_2();

	}

}

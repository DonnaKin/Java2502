package textbook;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class JLabelExam extends JFrame{
	public JLabelExam(){
	super("JLabel");
	JPanel jp = new JPanel();
	
	JLabel jlabel1 = new JLabel("레이블1");
	JLabel jlabel2 = new JLabel("레이블2",JLabel.CENTER);
	JLabel jlabel3 = new JLabel("레이블3",JLabel.LEFT);
	JLabel jlabel4 = new JLabel("레이블4",JLabel.RIGHT);
	
	jlabel1.setOpaque(true);
	jlabel1.setBackground(Color.yellow);
	jlabel2.setOpaque(true);
	jlabel2.setBackground(Color.blue);
	jlabel3.setOpaque(true);
	jlabel3.setBackground(Color.black);
	jlabel4.setOpaque(true);
	jlabel4.setBackground(Color.white);
//2번째
//	jlabel1.setForeground(Color.yellow);
//	jlabel2.setForeground(Color.blue);
//	jlabel3.setForeground(Color.black);
//	jlabel4.setForeground(Color.white);
	jp.add(jlabel1);
	jp.add(jlabel2);
	jp.add(jlabel3);
	jp.add(jlabel4);
	add(jp);
	setSize(300,100);
	setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelExam();
	}
}

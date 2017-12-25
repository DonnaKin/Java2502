package textbook;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class V_4 extends JFrame{
	public V_4(){
		super("라디오버튼형");
		JPanel jp = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("A형",true);
		JRadioButton rb2 = new JRadioButton("B형");
		JRadioButton rb3 = new JRadioButton("O형");
		JRadioButton rb4 = new JRadioButton("AB형");
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		jp.add(rb1);
		jp.add(rb2);
		jp.add(rb3);
		jp.add(rb4);
		add(jp);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new V_4();
	}
}

package textbook;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioCheckboxExam extends JFrame{
	public JRadioCheckboxExam(){
		super("������ư��");
		JPanel jp = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("����");
		JRadioButton rb2 = new JRadioButton("����");
		JRadioButton rb3 = new JRadioButton("���");
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		jp.add(rb1);
		jp.add(rb2);
		jp.add(rb3);
		add(jp);
		setSize(400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JRadioCheckboxExam();
	}
}

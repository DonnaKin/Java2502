package textbook;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckBoxExam_2 extends JFrame{
	public JCheckBoxExam_2(){
		super("üũ�ڽ���");
		JPanel jp = new JPanel();
		JCheckBox ck1 = new JCheckBox("���");
		JCheckBox ck2 = new JCheckBox("����",true);
		JCheckBox ck3 = new JCheckBox("Ű��");
		jp.add(ck1);
		jp.add(ck2);
		jp.add(ck3);
		add(jp);
		setSize(400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JCheckBoxExam_2();
	}
}

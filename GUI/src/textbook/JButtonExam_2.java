package textbook;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonExam_2 extends JFrame{
	public JButtonExam_2(){
		super("��ư");//�������� ���
		JPanel jp = new JPanel();
		JButton jb1 = new JButton("Ȯ��");
		JButton jb2 = new JButton("���");
		JButton jb3 = new JButton("����");
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		add(jp);
		
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JButtonExam_2();
	}
}

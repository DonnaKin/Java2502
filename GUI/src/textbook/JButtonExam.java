package textbook;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonExam extends JFrame{
	public JButtonExam(){
		super("버튼");//제목으로 띄움
		JPanel jp = new JPanel();
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton();
		jb2.setLabel("버튼2");
		
		jp.add(jb1);
		jp.add(jb2);
		add(jp);
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonExam();
	}
}

package textbook;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonExam_2 extends JFrame{
	public JButtonExam_2(){
		super("버튼");//제목으로 띄움
		JPanel jp = new JPanel();
		JButton jb1 = new JButton("확인");
		JButton jb2 = new JButton("취소");
		JButton jb3 = new JButton("삭제");
		
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

package textbook;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaExam extends JFrame{
	public JTextAreaExam(){
		super("JTextArea");
		JPanel jp = new JPanel();
		JTextArea jta1 = new JTextArea("first",3,30);
		JTextArea jta2 = new JTextArea("second",6,10);
		//jta2 TextArea에 스크롤바를 나타내기
		//JScrollPane jsp = new JScrollPane(jta2,JScrollPane.VERTICAL_SCROLLBAR,JScrollPane.HORIZONTAL_SCROLLBAR);
		jp.add(jta1);
		//jp.add(jsp);
		add(jp);
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaExam();
	}
}

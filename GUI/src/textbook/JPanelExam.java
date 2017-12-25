package textbook;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;	

public class JPanelExam extends JFrame{
	public JPanelExam(){
		JPanel jp = new JPanel();
		jp.setBackground(Color.magenta);
		jp.setSize(300, 200);
		add(jp);//프레임에 p를 붙임
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JPanelExam();
	}
}

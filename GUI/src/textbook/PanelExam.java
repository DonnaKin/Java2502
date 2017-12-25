package textbook;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelExam extends Frame{
	public PanelExam(){
		Panel p = new Panel();
		p.setBackground(Color.blue);
		p.setSize(300, 200);
		add(p);//프레임에 p를 붙임
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PanelExam();
	}
}

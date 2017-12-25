package textbook;

import java.awt.Frame;

import javax.swing.JFrame;

public class JFrameExam extends JFrame{
	public JFrameExam(){
		setTitle("«¡∑π¿”");
		setLocation(200, 10);
		setSize(1000, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		JFrameExam f = new JFrameExam();
	}
}

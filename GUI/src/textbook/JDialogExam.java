package textbook;

import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.JFrame;

public class JDialogExam extends JFrame{
	public JDialogExam(){
		super("JDialog");
		Dialog jd = new Dialog(this, "다이얼로그",false);
		setSize(300,100);
		setVisible(true);
		jd.setSize(200,50);
		jd.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JDialogExam();
	}
}

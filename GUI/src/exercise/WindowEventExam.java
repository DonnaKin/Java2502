package exercise;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventExam extends Frame implements WindowListener{
	public WindowEventExam(){
		super("�����ư�� �����ּ���.");
		setSize(300,100);
		setVisible(true);
		
		addWindowListener(this);
	}
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	public void windowClosed(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

	public static void main(String[] args) {
		new WindowEventExam();

	}

}

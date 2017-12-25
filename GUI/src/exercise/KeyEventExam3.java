package exercise;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyEventExam3 extends JFrame{
	JTextField jumin1 = new JTextField(10);
	JLabel lb = new JLabel("-",JLabel.CENTER);
	JTextField jumin2 = new JTextField(10);
	JPanel p = new JPanel();
	
	public KeyEventExam3(){
		super("KeyEvent");
		p.add(jumin1);
		p.add(lb);
		p.add(jumin2);
		add(p);
		setSize(300,100);
		setVisible(true);
		
		jumin1.addKeyListener(new MyClass2());
}
	public static void main(String[] args){
		new KeyEventExam3();
	}
class MyClass2 extends KeyAdapter{
	public void keyReleased(KeyEvent ke){
		if(jumin1.getText().trim().length()==6){
			jumin2.requestFocus();
		}
	}
	public void keyPressed(KeyEvent ke){
		if(ke.getKeyCode()==ke.VK_LEFT){
			jumin2.setText("Left ´­¸²");
		}
	}
}
}
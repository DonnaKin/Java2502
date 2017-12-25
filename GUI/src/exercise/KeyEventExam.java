package exercise;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventExam extends Frame implements KeyListener{
	TextField jumin1 = new TextField(10);
	Label lb = new Label("-",Label.CENTER);
	TextField jumin2 = new TextField(10);
	Panel p = new Panel();
	
	public KeyEventExam(){
		super("KeyEvent");
		p.add(jumin1);
		p.add(lb);
		p.add(jumin2);
		add(p);
		setSize(300,100);
		setVisible(true);
		
		jumin1.addKeyListener(this);
	}
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
	public void keyTyped(KeyEvent ke){}
	public static void main(String[] args){
		new KeyEventExam();
	}
}

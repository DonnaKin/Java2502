package exercise;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WeightTrans extends JFrame implements ActionListener,KeyListener{
	JTextField wt = new JTextField(15);
	JLabel lb = new JLabel("변환할 몸무게를 입력해주세요 : ");
	JButton trans = new JButton("변환");
	JPanel p = new JPanel();
	public WeightTrans(){
		super("WeightTrans");
		p.add(lb);
		p.add(wt);
		p.add(trans);
		add(p);
		setSize(500,100);
		setVisible(true);
		trans.addActionListener(this);
		wt.addKeyListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		int weight = Integer.parseInt(wt.getText());
		double pound = (double)weight/0.453592;
		String re = Double.toString(pound);
		wt.setText(re);
	}
	
	public void keyReleased(KeyEvent ke){
		if(ke.getKeyCode()==ke.VK_ENTER){
			int weight = Integer.parseInt(wt.getText());
			double pound = (double)weight/0.453592;
			String re = Double.toString(pound);
			wt.setText(re);
		}
	}
	public void keyPressed(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){}
	public static void main(String[] args) {
		new WeightTrans();
	}
}

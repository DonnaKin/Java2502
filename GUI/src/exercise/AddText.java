package exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddText extends JFrame{
	JPanel jp,jp2,jp3;
	JTextArea jt;
	JButton add, delete;
	JTextField jf;
	public AddText(){
		super("텍스트 입력기");
		setSize(250,300);
		Container cont = getContentPane();
		cont.setLayout(new BorderLayout());
		
		jp = new JPanel();
		jt = new JTextArea(10,20);
		jt.setBorder(BorderFactory.createLineBorder(Color.RED));
		jt.setEditable(false);
		jp.add(jt);
		cont.add(jp,BorderLayout.NORTH);
		
		jp2 = new JPanel();
		jf = new JTextField(10);
		jp2.add(jf);
		cont.add(jp2,BorderLayout.CENTER);
		
		jp3 = new JPanel();
		add = new JButton("추가한다");
		delete = new JButton("지운다");
		jp3.add(add);
		jp3.add(delete);
		cont.add(jp3,BorderLayout.SOUTH);
		
		ButtonActionListener ba = new ButtonActionListener();
		add.addActionListener(ba);
		delete.addActionListener(ba);
		
		setVisible(true);
		
	}
	private class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==add){
				jt.append(jf.getText()+"\n");
				jf.setText("");
			}
			else if(e.getSource()==delete){
				jt.setText("");
				jf.setText("");
			}
			else{
				jt.append(jf.getText());
				jf.setText("");
			}
		}
	}
	public static void main(String[] args) {
		new AddText();
	}
}

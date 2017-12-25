package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonAnswer extends JFrame implements ActionListener{
	JButton yes,no;
	JLabel choice;
	JPanel jp;
	
	public ButtonAnswer(){
		super("버튼 선택");
		setLayout(new BorderLayout());
		jp= new JPanel();
		yes = new JButton("yes");
		no = new JButton("no");
		choice = new JLabel("당신의 선택은 : ");
		
		jp.add(yes);
		jp.add(no);
		add(jp,BorderLayout.NORTH);
		add(choice,BorderLayout.SOUTH);
		
		setSize(300,100);
		setVisible(true);
		
		yes.addActionListener(this);
		no.addActionListener(this);
	}

 static void main(String[] args) {
		new ButtonAnswer();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==yes){
			choice.setText(yes.getActionCommand());
		}else if(e.getSource()==no){
			choice.setText(no.getActionCommand());
		}
		
	}

}

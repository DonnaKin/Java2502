package exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DivideByThree extends JPanel{
	private JLabel prompt, result;
	private JTextField number;
	private JButton check;
	public DivideByThree(){
		
		prompt = new JLabel("���� ���� �Է��ϼ���");
		result = new JLabel("");
		
		number = new JTextField(12);
		check = new JButton("�˻�");
		
		add(prompt);
		add(number);
		add(check);
		add(result);
		
		setPreferredSize(new Dimension(300,70));
		setBackground(Color.white);
		
		//������� �׼� ������
		NumberListener nl = new NumberListener();
		check.addActionListener(nl);
	}
	private class NumberListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String text = number.getText();
			int num = Integer.parseInt(text);
			
			if(num%3==0){
				number.setText("3�� �����Դϴ�.");
			}
			else {
				number.setText("3�� ������ �ƴմϴ�.");
			}
		}
	}
}
/*public class DivideByThree{
	public static void main(String[] args) {
		JFrame frame = new JFrame("3�� ��� Ȯ��");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DivideByThree db = new DivideByThree();
		frame.getContentPane().add(db);
		frame.pack();
		frame.setVisible(true);
	}
}
*/

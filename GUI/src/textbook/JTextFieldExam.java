package textbook;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class JTextFieldExam extends JFrame{
	public JTextFieldExam(){
		super("�ؽ�Ʈ �ʵ�");
		JPanel jp = new JPanel();
		JTextField jtf1 = new JTextField("�ֹε�Ϲ�ȣ���ڸ�",16);
		JPasswordField jtf2 = new JPasswordField(15);
		jtf1.selectAll();
		jtf2.setEchoChar('*');
		jp.add(jtf1);
		jp.add(jtf2);
		add(jp);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldExam();
	}
}

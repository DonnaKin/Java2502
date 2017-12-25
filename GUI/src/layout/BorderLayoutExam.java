package layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam extends JFrame{
	BorderLayoutExam(){
		super("BorderLayoutExam");
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(new JButton("��"),BorderLayout.NORTH);
		con.add(new JButton("�Ʒ�"),BorderLayout.SOUTH);
		con.add(new JButton("����"),BorderLayout.WEST);
		con.add(new JButton("������"),BorderLayout.EAST);
		con.add(new JButton("���"),BorderLayout.CENTER);
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutExam();
	}
}

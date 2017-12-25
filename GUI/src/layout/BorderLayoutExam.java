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
		con.add(new JButton("위"),BorderLayout.NORTH);
		con.add(new JButton("아래"),BorderLayout.SOUTH);
		con.add(new JButton("왼쪽"),BorderLayout.WEST);
		con.add(new JButton("오른쪽"),BorderLayout.EAST);
		con.add(new JButton("가운데"),BorderLayout.CENTER);
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutExam();
	}
}

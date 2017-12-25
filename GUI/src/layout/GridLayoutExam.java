package layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExam extends JFrame{
	GridLayoutExam(){
		super("GridLayout");
		Container con = getContentPane();
		con.setLayout(new GridLayout(2,3));
		con.add(new JButton("버튼1"));
		con.add(new JButton("버튼2"));
		con.add(new JButton("버튼3"));
		con.add(new JButton("버튼4"));
		con.add(new JButton("버튼5"));
		con.add(new JButton("버튼6"));
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutExam();
	}
}

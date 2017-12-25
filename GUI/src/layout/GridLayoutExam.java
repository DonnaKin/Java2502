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
		con.add(new JButton("��ư1"));
		con.add(new JButton("��ư2"));
		con.add(new JButton("��ư3"));
		con.add(new JButton("��ư4"));
		con.add(new JButton("��ư5"));
		con.add(new JButton("��ư6"));
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutExam();
	}
}

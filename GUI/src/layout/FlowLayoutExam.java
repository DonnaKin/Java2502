package layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExam extends JFrame{
	FlowLayoutExam(){
	super("FlowLayout");
	//각종 스타일
	Container cont = getContentPane();
	cont.setLayout(new FlowLayout());
	cont.add(new JButton("버튼1"));
	cont.add(new JButton("버튼2"));
	cont.add(new JButton("버튼3"));
	setSize(200,120);
	setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutExam();
	}
}

package layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExam extends JFrame{
	FlowLayoutExam(){
	super("FlowLayout");
	//���� ��Ÿ��
	Container cont = getContentPane();
	cont.setLayout(new FlowLayout());
	cont.add(new JButton("��ư1"));
	cont.add(new JButton("��ư2"));
	cont.add(new JButton("��ư3"));
	setSize(200,120);
	setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutExam();
	}
}

package exercise;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxButtonOnly extends JFrame{
	private JCheckBox bold,italic;
	private JButton ok,cancle;
	public CheckBoxButtonOnly(){
		super("������ȭ��");//setTitle("������ȭ��);
		setSize(200,120);
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		bold = new JCheckBox("���ü");
		italic = new JCheckBox("���Ÿ�ü");
		ok = new JButton("Ȯ��");
		cancle = new JButton("���");
		
		cont.add(bold);
		cont.add(italic);
		cont.add(ok);
		cont.add(cancle);
	}
	public static void main(String[] args) {
		CheckBoxButtonOnly fr = new CheckBoxButtonOnly();
		fr.setVisible(true);
	}
}

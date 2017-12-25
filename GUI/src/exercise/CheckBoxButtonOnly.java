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
		super("간단한화면");//setTitle("간단한화면);
		setSize(200,120);
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		bold = new JCheckBox("고딕체");
		italic = new JCheckBox("이탤릭체");
		ok = new JButton("확인");
		cancle = new JButton("취소");
		
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

package textbook;

import java.awt.Panel;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class V_3 extends JFrame{
	public V_3(){
		super("체크박스형");
		Panel p = new Panel();
		JCheckBox ck1 = new JCheckBox("봄");
		JCheckBox ck2 = new JCheckBox("여름");
		JCheckBox ck3 = new JCheckBox("가을");
		JCheckBox ck4 = new JCheckBox("겨울",true);
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		p.add(ck4);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new V_3();
	}
}

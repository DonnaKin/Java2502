package test;

import java.awt.Color;
import java.awt.List;
import java.awt.TextArea;

import javax.swing.*;

public class Test_1 extends JFrame{
	public Test_1(){
		super("�׽�Ʈ");
		JPanel jp = new JPanel();
		JLabel id = new JLabel("���̵�",JLabel.LEFT);
		id.setOpaque(true);
		id.setBackground(Color.blue);
		jp.add(id);
		JTextField jtf1 = new JTextField(17);
		jtf1.selectAll();
		jp.add(jtf1);
		
		JLabel pass = new JLabel("��й�ȣ");
		pass.setLocation(0, 1);
		pass.setOpaque(true);
		pass.setBackground(Color.blue);
		jp.add(pass);
		JPasswordField jtf2 = new JPasswordField(16);
		jtf2.setEchoChar('*');
		jp.add(jtf2);
		
		JLabel text = new JLabel("1. ����� ���ɺоߴ�?(������ ���ð���)");
		JCheckBox ck1 = new JCheckBox("news");
		JCheckBox ck2 = new JCheckBox("sports");
		JCheckBox ck3 = new JCheckBox("movies");
		JCheckBox ck4 = new JCheckBox("music");
		jp.add(text);
		jp.add(ck1);
		jp.add(ck2);
		jp.add(ck3);
		jp.add(ck4);
		
		JLabel text2 = new JLabel("2. �󸶳� ���ֱ��忡 ���ʴϱ�?");
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("�Ѵ޿� �ѹ�");
		JRadioButton rb2 = new JRadioButton("�����Ͽ� �ѹ�");
		jp.add(text2);
		bg.add(rb1);
		bg.add(rb2);
		jp.add(rb1);
		jp.add(rb2);
		
		JLabel text3 = new JLabel("3. �����ϴ� ������?");
		List list = new List(2,true);
		list.add("��");
		list.add("����");
		list.add("����");
		list.add("�ܿ�");
		JRadioButton rb3 = new JRadioButton("���� �Ȱ���.");
		bg.add(rb3);
		jp.add(rb3);
		jp.add(text3);
		jp.add(list);
		
		JLabel text4 = new JLabel("4.�ϰ���� ���� ���⼼��.");
		jp.add(text4);
		JTextArea jta2 = new JTextArea("�Է�: ",6,10);
		jp.add(jta2);
		getContentPane().add(jp);
		setSize(300,450);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test_1();
	}

}

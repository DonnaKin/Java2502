package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V_13 extends JFrame{
	public V_13(){
		super("친구정보");
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		JLabel name = new JLabel("이 름");
		jp.add(name);
		//con.add(name);
		jp.add(new JTextField(16));
		JButton search = new JButton("검색");
		jp.add(search);
		con.add(jp,BorderLayout.NORTH);
		
		TextArea jt = new TextArea("",50,60,TextArea.SCROLLBARS_VERTICAL_ONLY);
		//JScrollPane js = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//js.setSize(50,60);
		con.add(jt,BorderLayout.CENTER);
		
		JPanel jp2 = new JPanel();
		JButton save = new JButton("저장");
		jp2.add(save);
		JButton delete = new JButton("삭제");
		jp2.add(delete);
		JButton replace = new JButton("수정");
		jp2.add(replace);
		con.add(jp2, BorderLayout.SOUTH);
		setSize(500,350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new V_13();
	}
}

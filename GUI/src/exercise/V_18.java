package exercise;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V_18 extends JFrame implements ActionListener,ItemListener{
	JPanel all,Pgroup,Pname;
	JLabel name, birth, mon, day, solar, lunar, phone, group, school, academy, town, etc;
	JTextField tf_name, tf_phone;
	JButton search, save, delete, remove;
	JComboBox ch_mon, ch_day;
	JRadioButton rb_sol, rb_lu;
	ButtonGroup bg;
	JCheckBox cb_sch, cb_aca, cb_to, cb_etc;
	TextArea result;
	String s_name = "/�̸�:",s_birth="/����:",solu="",s_phone="/��ȭ:",s_group="/�׷�:";
	
	public V_18(){
		super("ģ������");
		all = new JPanel();
		all.setLayout(new FlowLayout());
		Pname = new JPanel(new FlowLayout());
		name = new JLabel("�� ��: ");
		tf_name = new JTextField(20);
		search = new JButton("�˻�");
		Pname.add(name);
		Pname.add(tf_name);
		Pname.add(search);
		all.add(Pname);
		
		birth = new JLabel("�� ��: ");
		ch_mon = new JComboBox();
		mon = new JLabel("��");
		ch_day = new JComboBox();
		for(int i=1;i<13;i++)
		ch_mon.addItem(i);
		day = new JLabel("��");
		for(int i=1;i<32;i++)
			ch_day.addItem(i);
		bg = new ButtonGroup();
		rb_sol = new JRadioButton();
		rb_sol.addItemListener(this);
		solar = new JLabel("���");
		rb_lu = new JRadioButton();
		rb_lu.addItemListener(this);
		lunar = new JLabel("����");
		bg.add(rb_sol);
		bg.add(rb_lu);
		all.add(birth);
		all.add(ch_mon);
		all.add(mon);
		all.add(ch_day);
		all.add(day);
		all.add(rb_sol);
		all.add(solar);
		all.add(rb_lu);
		all.add(lunar);
		
		phone = new JLabel("��ȭ��ȣ:");
		tf_phone = new JTextField(20);
		all.add(phone);
		all.add(tf_phone);
		
		Pgroup = new JPanel(new FlowLayout());
		group = new JLabel("�� ��:");
		cb_sch = new JCheckBox();
		cb_sch.addItemListener(this);
		school = new JLabel("�� ��");
		cb_aca = new JCheckBox();
		cb_aca.addItemListener(this);
		academy = new JLabel("�� ��");
		cb_to = new JCheckBox();
		cb_to.addItemListener(this);
		town = new JLabel("�� ��");
		cb_etc = new JCheckBox();
		cb_etc.addItemListener(this);
		etc = new JLabel("�� Ÿ");
		Pgroup.add(group);
		Pgroup.add(cb_sch);
		Pgroup.add(school);
		Pgroup.add(cb_aca);
		Pgroup.add(academy);
		Pgroup.add(cb_to);
		Pgroup.add(town);
		Pgroup.add(cb_etc);
		Pgroup.add(etc);
		all.add(Pgroup);
		
		result = new TextArea("",1,40,TextArea.SCROLLBARS_BOTH);
		all.add(result);
		
		save = new JButton("����");
		save.addActionListener(this);
		delete = new JButton("����");
		remove = new JButton("����");
		all.add(save);
		all.add(delete);
		all.add(remove);
		
		add(all);
		setSize(350,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		
	}
	public void itemStateChanged(ItemEvent ie){
		if(ie.getStateChange()==ItemEvent.SELECTED){
			
		}
	}
	public static void main(String[] args) {
		new V_18();
	}
}

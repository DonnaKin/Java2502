package database;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

public class V_18 extends JFrame implements ActionListener {
	JPanel all, Pgroup, Pname;
	JLabel name, birth, mon, day, phone, group, school, academy, town, etc;
	// JLabel solar, lunar;
	JTextField tf_name, tf_phone;
	JButton search, save, delete, remove, clear;
	Choice ch_mon;
	Choice ch_day;
	Checkbox rb_sol;
	Checkbox rb_lu;
	CheckboxGroup bg;
	Checkbox cb_sch, cb_aca, cb_to, cb_etc;
	TextArea result;
	String s_name = "/�̸�:", s_birth = "/����:", solu = "", s_phone = "/��ȭ:",
			s_group = "/�׷�:";

	public V_18() {
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
		ch_mon = new Choice();
		mon = new JLabel("��");
		ch_day = new Choice();
		for (int i = 1; i < 13; i++)
			ch_mon.addItem(Integer.toString(i));
		day = new JLabel("��");
		for (int i = 1; i < 32; i++)
			ch_day.addItem(Integer.toString(i));
		bg = new CheckboxGroup();
		rb_sol = new Checkbox("���", bg, false);
		rb_lu = new Checkbox("����", bg, false);
		all.add(birth);
		all.add(ch_mon);
		all.add(mon);
		all.add(ch_day);
		all.add(day);
		all.add(rb_sol);
		all.add(rb_lu);
		// all.add(solar);
		// all.add(lunar);

		phone = new JLabel("��ȭ��ȣ:");
		tf_phone = new JTextField(20);
		all.add(phone);
		all.add(tf_phone);

		Pgroup = new JPanel(new FlowLayout());
		group = new JLabel("�� ��:");
		cb_sch = new Checkbox();
		school = new JLabel("�� ��");
		cb_aca = new Checkbox();
		academy = new JLabel("�� ��");
		cb_to = new Checkbox();
		town = new JLabel("�� ��");
		cb_etc = new Checkbox();
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

		result = new TextArea("", 1, 40, TextArea.SCROLLBARS_BOTH);
		all.add(result);

		save = new JButton("����");
		delete = new JButton("����");
		remove = new JButton("����");
		clear = new JButton("�ʱ�ȭ");
		all.add(save);
		all.add(delete);
		all.add(remove);
		all.add(clear);

		save.addActionListener(this);
		remove.addActionListener(this);
		delete.addActionListener(this);
		search.addActionListener(this);
		clear.addActionListener(this);

		add(all);
		setSize(350, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String str_name = tf_name.getText();
		String str_month = ch_mon.getSelectedItem();
		String str_day = ch_day.getSelectedItem();
		String str_cb = null;

		if (rb_sol.getState())
			str_cb = rb_sol.getLabel();
		else
			str_cb = rb_lu.getLabel();
		String str_phone = tf_phone.getText();
		String str_group = "";

		if (cb_sch.getState())
			str_group = str_group + cb_sch.getLabel();
		if (cb_aca.getState())
			str_group = str_group + cb_aca.getLabel();
		if (cb_to.getState())
			str_group = str_group + cb_to.getLabel();
		if (cb_etc.getState())
			str_group = str_group + cb_etc.getLabel();

		// 1. ����̹� ����
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.err.println("DB ���� ����̹��� ����");
		}
		// 2. DB������ ����
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/test5?useSSL=false";
		String id = "root";
		String pw = "account";
		try {
			conn = DriverManager.getConnection(url, id, pw);
		} catch (SQLException ee) {
			System.err.println("DB ���� ���� ����");
		}
		// 3. Statement��ü ����
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException ee) {
			System.err.println("�۾� ó�� ��ü ���� ����");
		}
		ResultSet rs = null;

		if (e.getSource() == search) {
			rb_sol.setState(false);
			rb_lu.setState(false);
			cb_sch.setState(false);
			cb_aca.setState(false);
			cb_to.setState(false);
			cb_etc.setState(false);

			try {
				rs = stmt.executeQuery("select * from t1 where name = '"
						+ str_name + "'");
				if (rs.next()) {
					ch_mon.select(rs.getString("month"));
					ch_day.select(rs.getString("day"));
					if (rs.getString("birth_option").equals("���")) {
						rb_sol.setState(true);
					} else {
						rb_lu.setState(true);
					}
					tf_phone.setText(rs.getString("phone"));
					if (rs.getString("group1").equals("1")) {
						cb_sch.setState(true);
					}
					if (rs.getString("group2").equals("1")) {
						cb_aca.setState(true);
					}
					if (rs.getString("group3").equals("1")) {
						cb_to.setState(true);
					}
					if (rs.getString("group4").equals("1")) {
						cb_etc.setState(true);
					}
				}
				result.setText("�˻��Ϸ�!");
			} catch (SQLException ee) {
				System.err.println("�˻� ���ɾ� ���� ����" + ee.toString());
			}
		} else if (e.getSource() == clear) {
			rb_sol.setState(false);
			rb_lu.setState(false);
			cb_sch.setState(false);
			cb_aca.setState(false);
			cb_to.setState(false);
			cb_etc.setState(false);
			tf_name.setText("");
			tf_phone.setText("");
			result.setText("");
		} else if (e.getSource() == save) {
			// �����ư ������
			try {
				int num = stmt.executeUpdate("insert into t1 values('"
						+ str_name + "'" + "," + str_month + "," + str_day
						+ "," + "'" + str_cb + "'" + "," + "'" + str_phone
						+ "'" + "," + cb_sch.getState() + ","
						+ cb_aca.getState() + "," + cb_to.getState() + ","
						+ cb_etc.getState() + ")");
				result.setText("���ԿϷ�!");
				System.out.println(num + "�� ���� ����");
			} catch (SQLException ee) {
				System.err.println("���ɾ� ���� ����" + ee.toString());
			}
		} else if (e.getSource() == remove) {
			// ������ư ������
			try {
				int renum = stmt.executeUpdate("update t1 set '" + str_name
						+ "'" + "," + str_month + "," + str_day + "," + "'"
						+ str_cb + "'" + "," + 
						"'"+ str_phone + "'" + ","
						+ cb_sch.getState() + "," + cb_aca.getState() + ","
						+ cb_to.getState() + "," + cb_etc.getState()
						+ "where name = " + str_name + ")");
				result.setText("�����Ϸ�!");
				System.out.println(renum + "�� ���� ����");
			} catch (SQLException ee) {
				System.err.println("���ɾ� ���� ����" + ee.toString());
			}

		} else if (e.getSource() == delete) {
			// ������ư ������
			try {
				int denum = stmt.executeUpdate("delete from t1 where name = "
						+ str_name + ")");
				result.setText("�����Ϸ�!");
				System.out.println(denum + "�� ���� ����");
			} catch (SQLException ee) {
				System.err.println("���ɾ� ���� ����" + ee.toString());
			}
		}

		try {
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("���� ���� ����" + ee.toString());
		}
	}

	public static void main(String[] args) {
		new V_18();
	}
}
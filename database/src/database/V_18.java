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
	String s_name = "/이름:", s_birth = "/생일:", solu = "", s_phone = "/전화:",
			s_group = "/그룹:";

	public V_18() {
		super("친구정보");
		all = new JPanel();
		all.setLayout(new FlowLayout());
		Pname = new JPanel(new FlowLayout());
		name = new JLabel("이 름: ");
		tf_name = new JTextField(20);
		search = new JButton("검색");
		Pname.add(name);
		Pname.add(tf_name);
		Pname.add(search);
		all.add(Pname);

		birth = new JLabel("생 일: ");
		ch_mon = new Choice();
		mon = new JLabel("월");
		ch_day = new Choice();
		for (int i = 1; i < 13; i++)
			ch_mon.addItem(Integer.toString(i));
		day = new JLabel("일");
		for (int i = 1; i < 32; i++)
			ch_day.addItem(Integer.toString(i));
		bg = new CheckboxGroup();
		rb_sol = new Checkbox("양력", bg, false);
		rb_lu = new Checkbox("음력", bg, false);
		all.add(birth);
		all.add(ch_mon);
		all.add(mon);
		all.add(ch_day);
		all.add(day);
		all.add(rb_sol);
		all.add(rb_lu);
		// all.add(solar);
		// all.add(lunar);

		phone = new JLabel("전화번호:");
		tf_phone = new JTextField(20);
		all.add(phone);
		all.add(tf_phone);

		Pgroup = new JPanel(new FlowLayout());
		group = new JLabel("그 룹:");
		cb_sch = new Checkbox();
		school = new JLabel("학 교");
		cb_aca = new Checkbox();
		academy = new JLabel("학 원");
		cb_to = new Checkbox();
		town = new JLabel("동 네");
		cb_etc = new Checkbox();
		etc = new JLabel("기 타");
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

		save = new JButton("저장");
		delete = new JButton("삭제");
		remove = new JButton("수정");
		clear = new JButton("초기화");
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

		// 1. 드라이버 연결
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.err.println("DB 연결 드라이버가 없음");
		}
		// 2. DB서버와 연결
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/test5?useSSL=false";
		String id = "root";
		String pw = "account";
		try {
			conn = DriverManager.getConnection(url, id, pw);
		} catch (SQLException ee) {
			System.err.println("DB 서버 연결 실패");
		}
		// 3. Statement객체 생성
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException ee) {
			System.err.println("작업 처리 객체 생성 실패");
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
					if (rs.getString("birth_option").equals("양력")) {
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
				result.setText("검색완료!");
			} catch (SQLException ee) {
				System.err.println("검색 명령어 전송 실패" + ee.toString());
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
			// 저장버튼 누르면
			try {
				int num = stmt.executeUpdate("insert into t1 values('"
						+ str_name + "'" + "," + str_month + "," + str_day
						+ "," + "'" + str_cb + "'" + "," + "'" + str_phone
						+ "'" + "," + cb_sch.getState() + ","
						+ cb_aca.getState() + "," + cb_to.getState() + ","
						+ cb_etc.getState() + ")");
				result.setText("삽입완료!");
				System.out.println(num + "개 삽입 성공");
			} catch (SQLException ee) {
				System.err.println("명령어 전송 실패" + ee.toString());
			}
		} else if (e.getSource() == remove) {
			// 수정버튼 누르면
			try {
				int renum = stmt.executeUpdate("update t1 set '" + str_name
						+ "'" + "," + str_month + "," + str_day + "," + "'"
						+ str_cb + "'" + "," + 
						"'"+ str_phone + "'" + ","
						+ cb_sch.getState() + "," + cb_aca.getState() + ","
						+ cb_to.getState() + "," + cb_etc.getState()
						+ "where name = " + str_name + ")");
				result.setText("수정완료!");
				System.out.println(renum + "개 삽입 성공");
			} catch (SQLException ee) {
				System.err.println("명령어 전송 실패" + ee.toString());
			}

		} else if (e.getSource() == delete) {
			// 삭제버튼 누르면
			try {
				int denum = stmt.executeUpdate("delete from t1 where name = "
						+ str_name + ")");
				result.setText("삭제완료!");
				System.out.println(denum + "개 삭제 성공");
			} catch (SQLException ee) {
				System.err.println("명령어 전송 실패" + ee.toString());
			}
		}

		try {
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("접속 종료 실패" + ee.toString());
		}
	}

	public static void main(String[] args) {
		new V_18();
	}
}

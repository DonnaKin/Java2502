package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectExam {

	public static void main(String[] args) {
		//1. ����̹� ����
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException e){
			System.err.println("DB ���� ����̹��� ����");
		}
		//2. DB������ ����
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/test5?useSSL=false";
		String id = "root";
		String pw = "account";
		try{
			conn = DriverManager.getConnection(url,id,pw);
		}catch(SQLException e){
			System.err.println("DB ���� ���� ����");
		}
		//3. Statement��ü ����
		Statement stmt = null;
		try{
			stmt = conn.createStatement();
		}catch(SQLException e){
			System.err.println("�۾� ó�� ��ü ���� ����");
		}
		//4. ��ɾ� �ۼ� �� ��� ����
		ResultSet rs = null;
		try{
			rs = stmt.executeQuery("select * from t1");
			while(rs.next()){
				System.out.println(rs.getString("name")+"-"+rs.getString("month")+"-"+
			rs.getString("day"));
			}
		}catch(SQLException e){
			System.err.println("��ɾ� ���� ����"+e.toString());
		}
		//5. ��������
		try{
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException e){
			System.err.println("���� ���� ����"+e.toString());
		}
	}
}

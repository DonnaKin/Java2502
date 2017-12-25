package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectExam {

	public static void main(String[] args) {
		//1. 드라이버 연결
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException e){
			System.err.println("DB 연결 드라이버가 없음");
		}
		//2. DB서버와 연결
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/test5?useSSL=false";
		String id = "root";
		String pw = "account";
		try{
			conn = DriverManager.getConnection(url,id,pw);
		}catch(SQLException e){
			System.err.println("DB 서버 연결 실패");
		}
		//3. Statement객체 생성
		Statement stmt = null;
		try{
			stmt = conn.createStatement();
		}catch(SQLException e){
			System.err.println("작업 처리 객체 생성 실패");
		}
		//4. 명령어 작성 및 결과 보기
		ResultSet rs = null;
		try{
			rs = stmt.executeQuery("select * from t1");
			while(rs.next()){
				System.out.println(rs.getString("name")+"-"+rs.getString("month")+"-"+
			rs.getString("day"));
			}
		}catch(SQLException e){
			System.err.println("명령어 전송 실패"+e.toString());
		}
		//5. 접속종료
		try{
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException e){
			System.err.println("접속 종료 실패"+e.toString());
		}
	}
}

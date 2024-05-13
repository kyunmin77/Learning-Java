import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
// 

public class JDBCConnTest02_Oracle {
	public static void main(String[] args) {
		
		String sql = "select eno,ename,job,sal from emp";
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";   //
		Connection con = null;   //DB 서버에 연결하도록 해주는 클래스
		Statement stmt = null;	 // 쿼리명령어를 실행해주는 클래스
		ResultSet rs = null;	 // 검색결과를 저장하는 클래스
		
		
		try {  // try-catch 반드시 필요 없을시 에러남
			Class.forName(driver); // driver를 인스턴스화 해줌 (com.mysql.cj.jdbc.Drive 로딩)
			con = DriverManager.getConnection(url,"system","1234"); // 연결(주소,이름,번호)
			stmt = con.createStatement();	// 쿼리의 초기화 작업
			
			rs = stmt.executeQuery(sql);	// 사용자지정 쿼리를 DB서버에 실행시켜주는 매서드 executeQuery() - *selectQuery만 실행
			
			System.out.println("사원번호   이름     업무     연봉");
			System.out.println("============================");
			while(rs.next()) {
				System.out.print(rs.getString(1)+ "\t");
				System.out.print(rs.getString(2)+ "\t");
				System.out.print(rs.getString(3)+ "\t");
				System.out.print(rs.getInt(4)+ "\n");
			}
			
			System.out.println("DB Connection OK!");
		}catch (Exception e) {
			System.out.println("DB Connection failure!");
			e.printStackTrace();
		}
		finally { //반드시 실행되는 명령
			try {
				if(rs != null) rs.close();
				if(con != null) con.close();
				if(stmt != null) stmt.close();	//클로즈 반드시 시켜주기 - 자원낭비 방지
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}



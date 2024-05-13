import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
// 프로젝트 우클릭- 필드패스 - 컨피켜 빌드패스 - 익스터널 쟈 추가

public class JDBCConnTest01_MySQL {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";   // 3306 mysql의 약속된 포트번호 /java< 내가만든 DB이름
		Connection con = null;   //DB 서버에 연결하도록 해주는 클래스
		Statement stmt = null;	 // 쿼리명령어를 실행해주는 클래스
		
		try {  // try-catch 반드시 필요 없을시 에러남
			Class.forName(driver); // driver를 인스턴스화 해줌 (com.mysql.cj.jdbc.Drive 로딩)
			con = DriverManager.getConnection(url,"root","1234"); // 연결(주소,이름,번호)
			stmt = con.createStatement();	// 쿼리를 날릴 준비
			System.out.println("DB Connection OK!");
		}catch (Exception e) {
			System.out.println("DB Connection failure!");
			e.printStackTrace();
		}
		finally { //반드시 실행되는 명령
			try {
				if(con != null) con.close();
				if(stmt != null) stmt.close();	//클로즈 반드시 시켜주기 - 자원낭비 방지
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}



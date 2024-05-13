import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
// 

public class JDBCConnTest03_Oracle {
	public static void main(String[] args) {
		
		String sql = "INSERT INTO goodsinfo VALUES(?,?,?,?)"; // ? >> 바인딩 변수 - ? 에 값을 대입시킬 예정
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";   //
		Connection con = null;   //DB 서버에 연결하도록 해주는 클래스
		PreparedStatement stmt = null;	 // ? 에 값을 저장시키는 클래스
		
		String code,name,maker;
		int price;
		Scanner s = new Scanner(System.in);
		
		try {  // try-catch 반드시 필요 없을시 에러남
			System.out.print("품목코드 : ");
			code = s.nextLine();
			System.out.print("상품명 : ");
			name = s.nextLine();
			System.out.print("가격 : ");
			price = Integer.parseInt(s.nextLine());
			System.out.print("제조사 : ");
			maker = s.nextLine();
			
			Class.forName(driver); // driver를 인스턴스화 해줌 (com.mysql.cj.jdbc.Drive 로딩)
			con = DriverManager.getConnection(url,"system","1234"); // 연결(주소,이름,번호)
			stmt = con.prepareStatement(sql);	// 쿼리의 초기화 작업
			stmt.setString(1, code);
			stmt.setString(2, name);
			stmt.setInt(3, price);
			stmt.setString(4, maker);		//?에 들어갈 내용이 정해짐
			
			int resultCount = stmt.executeUpdate();	// 쿼리가 실행됨 > "몇" 행이 삽입되었는지가 resultCount에 저장됨
			// selectQuery 외의 Query가 실행될때는 executeUpdate() 사용됨 >> 행위가 영항을미친 행의 숫자가 반환됨
			
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



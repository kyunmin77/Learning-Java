package IOExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps); // Sys.out 대상을 ps 즉 test.txt 로 변경)
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
		
		System.out.println("Hello by System.out");  // sys.out은 텍스트 파일에 출력
 		System.err.println("Hello by System.err");	// sys.err는 IDE에 출력
		
	}
}

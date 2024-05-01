package IOExample;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
	public static void main(String[] args) {
		try {
			
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			// 버퍼의 크기를 5로 함
			for(int i='1'; i<='9';i++) {	//1~9출력
				bos.write(i);
			}
			// 1~9 출력								
			bos.close();			
		//	fos.close(); > 버퍼크기가 5라서 12345 만 출력됨
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

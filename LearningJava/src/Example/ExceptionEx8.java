package Example;

public class ExceptionEx8 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);   // 예외발생되었기 떄문에 실행 안됨
		} catch (ArithmeticException ae) 	{
			ae.printStackTrace();
			System.out.println("예외 메세지 : " + ae.getMessage());
		}
		
		System.out.println(6);
	}
}

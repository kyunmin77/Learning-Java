package ClassExample;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fullName = "Hello.java";
		
		int index = fullName.indexOf('.');
		
		String fileName = fullName.substring(0,index);
		
//		fullName.substring(index+1,fullName.length());
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 확장자는 " + ext);
	}

}

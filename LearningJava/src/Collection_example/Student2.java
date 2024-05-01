package Collection_example;

public class Student2 implements Comparable {	// 오름차순 정렬을 제공하는 Comparable 인터페이스를 이용

	public final static int LEFT = 0;		//	 final로 선언된 클래스 변수들
	public final static int CENTER = 1;		// 	 
	public final static int RIGHT = 2;		// 	 format메서드에서 들여쓰기 할때 사용

	public String name;
	public String studentNo;
	public int koreanScore;
	public int mathScore;
	public int englishScore;
	public int total;

	public Student2() {			// 디폴트 생성자
	}

	// total을 제외한 맴버변수를 맴버변수를 매개변수로 받는 생성자
	public Student2(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		super();											
		this.name = name;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		this.total = koreanScore + mathScore + englishScore;	// total 초기화
	}

	@Override
	public String toString() { 	// Student2의 인스턴스의 출력형태 지정
		// TODO Auto-generated method stub
		return format(name, 4, LEFT) + format(studentNo, 4, RIGHT) + format("" + koreanScore, 6, RIGHT)
				+ format("" + mathScore, 6, RIGHT) + format("" + englishScore, 6, RIGHT) + format("" + total, 8, RIGHT);

	}

	public static String format(String str, int length, int aligment) {	// 클래스 머서드 format, length: str이 들어갈 칸 길이
		int diff = length - str.length();

		if (diff < 0)								//	칸길이보다 str이 더 길면
			return str.substring(0, length);		//	str을 칸길이까지만 잘라서 표기

		char[] source = str.toCharArray();			//	str을 char의 배열로 바꿔서 source[]에 대입
		char[] result = new char[length];			

		for (int i = 0; i < result.length; i++)
			result[i] = ' ';						//	length 길이만큼 result를 빈칸으로 채움

		switch (aligment) {

		case CENTER:
			System.arraycopy(source, 0, result, diff / 2, source.length);		//가운데 정렬
			break;
		case RIGHT:
			System.arraycopy(source, 0, result, diff, source.length);			//오른쪽 정렬
			break;
		case LEFT:
		default:
			System.arraycopy(source, 0, result, 0, source.length);				// 왼쪽 정렬
		}
		return new String(result);	// 정렬된 str을 포함한 result를 반환

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub

		int result = -1;
		if (o instanceof Student2) {
			Student2 temp = (Student2) o;
			result = (this.name).compareTo(temp.name);		
		}
		return result;		// 조건에 따라 1,0,-1을 반환
	}

}

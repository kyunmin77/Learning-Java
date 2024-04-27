package Collection_Framework;

import java.util.Arrays;

public class ComparatorEx { // 11-19

	public static void main(String[] args) {
		String[] strArr = {"cat","Dog","lion","tiger"};
		Arrays.sort(strArr);	 //String의 Comparable 구현에의한 정렬
		System.out.println("strArr= "+ Arrays.toString(strArr));
		
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);	 // 대소문자 구분 안함!
		System.out.println("strArr= "+ Arrays.toString(strArr));
	
		Arrays.sort(strArr, new Descending());	 //String의 Comparable 구현에의한 정렬
		System.out.println("strArr= "+ Arrays.toString(strArr));
	}

}
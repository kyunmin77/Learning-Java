package Collection_example;

import java.util.Comparator;

public class NameAscending implements Comparator {	// 오름차순 외의 다른 정렬을 사용할수 있는 Comparator 인터페이스를 이용

	@Override
	public int compare(Object o1, Object o2) {		// 인스턴스 두개를 비교
		// TODO Auto-generated method stub

		if (o1 instanceof Student2 && o2 instanceof Student2) {		// o1,o2가 Student2에 속해있는지 확인
			Student2 s1 = (Student2) o1;				
			Student2 s2 = (Student2) o2;							// Student2로 형변환
			return (s1.name).compareTo(s2.name);
		}

		return -1;			// 	o1,o2가 Student2에 속해있지 않으면 -1반환
	}
}

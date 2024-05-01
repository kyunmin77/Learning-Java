package Collection_example;

import java.util.ArrayList;	
import java.util.Collections;
import java.util.Scanner;

public class ScoreProcess {	

	static ArrayList<Student2> record = new ArrayList<Student2>();	// record에는 Student2 클래스의 인스턴스만 입력받음
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {	// 
		while (true) {
			switch (displayMenu()) {		// switch가 실행될때 displayMenu()를 실행되고 1,2,3,4 중 하나를 반환받음
			case 1:
				inputRecord();
				break;
			case 2:
				deleteRecord();
				break;
			case 3:
				sortRecord();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);			// 프로그램 종료
			}
		}
	}

	static int displayMenu() {
		System.out.println("*************************************************************************");
		System.out.println("*				성적관리프로그램				*");
		System.out.println("*				version 1.0				*");
		System.out.println("*			excerpt form java의 정석				*");
		System.out.println("*************************************************************************");
		System.out.println();
		System.out.println();
		System.out.println(" 1.학생성적 입력하기 ");
		System.out.println();
		System.out.println(" 2.학생성적 삭제하기 ");
		System.out.println();
		System.out.println("3. 학생성적 정렬하여보기(이름순, 성적순) ");
		System.out.println();
		System.out.println(" 4. 프로그램 종료 ");
		System.out.println();
		System.out.println();
		System.out.print(" 원하는 메뉴를 선택하세요(1~4) : ");

		int menu = 0;

		do {
			try {
				menu = Integer.parseInt(s.nextLine());		// menu 입력 받음
				if (menu >= 1 && menu <= 4) {
					break;									// 1~4를 선택하면 do_while을 빠져나감
				} else {
					throw new Exception();					// 1~4 이외를 선택하면 오류를 던짐
				}
			} catch (Exception e) {							// 	오류가 발생하면 오류를 받아오고 catch문을 실행
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");	
				System.out.print("원하는 메뉴 선택하세요.(1~4 : )");
			}
		} while (true);

		return menu;	// menu를 반환
	}

	static void inputRecord() {		

		System.out.println("1. 학생성적 입력하기");
		System.out.println("이름,학번,국어성적,영어성적,수학성적'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");			

		while (true) {
			System.out.println(">>");

			do {
				try {
					String input = s.nextLine().trim();		//input을 앞뒤 공백을 잘라 입력받음

					if (!input.equalsIgnoreCase("q")) {			// 대소문자 구분 없이 q를 입력받았는지 확인
						Scanner s2 = new Scanner(input).useDelimiter(",");		// input을 스캔해서 ","를 구분자로 나누고  

						//	record에 s2에 담긴 데이터를 입력
						record.add(new Student2(s2.next(), s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt()));
						System.out.println("잘입력되었습니다. 입력을 마치려면 q를 입력하세요.");
						break;		// do_while문을 빠져나옴
					} else
						return;		// inputRecord()을 끝냄
				} catch (Exception e) {		// 오류가 발생하면 catch문 실행
					System.out.println("입력오류입니다. 이름,학번,국어성적,영어성적,수학성적'의 순서로 입력하세요.");
					break;		// do_while문을 빠져나옴
				}
			} while (true);
		} // while

	}

	static void deleteRecord() {
		while (true) {
			displayRecord();		//displayRecord() 실행
			System.out.println("삭제하고자 하는 데이터의 학번을 입력하세여.(q: 메인화면)");
			System.out.println(">>");

			do {
				try {
					String input = s.nextLine().trim();		//input을 앞뒤 공백을 잘라 입력받음

					if (!input.equalsIgnoreCase("q")) {		// 대소문자 구분 없이 q를 입력받았는지 확인
						int length = record.size();
						boolean found = false;

						for (int i = 0; i < length; i++) {		//record의 길이만큼 record에 들어있는 객체를 받아옴
							Student2 student = (Student2) record.get(i);
							if (input.equals(student.studentNo)) {		// input이 해당객체의 학번과 같으면
								found = true;
								record.remove(i);						// record에서 객체를 삭제하고
								break;									// for문을 빠져나옴
							}
						}
						
						if (found) {		// 삭제된 객체가 있다면
							System.out.println("삭제되었습니다.");
						} else {
							System.out.println("일치하는 데이터가 없습니다.");
						}
						break;											// do_while문을 빠져나옴
					} else {				//q를 입력받았다면
						return;											// deleteRecord()을 끝냄
					}
				} catch (Exception e) {			// 오류가 발생하면 catch문 실행	
					System.out.println("입력오류입니다. 다시 입력해 주세요.");
					break;												// do_while문을 빠져나옴	
				}
			} while (true);
		}
	}

	static void sortRecord() {
		while (true) {
			System.out.print(" 정렬기준을 선택하세요. (1.이름순 2.총점순, 3.메인메뉴) : ");
			int sort = 0;

			do {
				try {
					sort = Integer.parseInt(s.nextLine());			// sort를 입력받음
					if (sort >= 1 && sort <= 3) {					
						break;										// 1~3를 선택하면 do_while을 빠져나감
					} else {
						throw new Exception();						// 1~3 이외를 선택하면 오류를 던짐
					}
				} catch (Exception e) {						// 	오류가 발생하면 오류를 받아고 catch문을 실행
					System.out.println("유효하지 않은 입력값입니다. 다시 입력해 주세요.");
					System.out.print(" 정렬기준을 선택하세요. (1.이름순 2.총점순, 3.메인메뉴) : ");
				}

			} while (true);

			if (sort == 1) {			// 1번 선택 
				Collections.sort(record, new NameAscending());		//record를 NameAscending()의 규칙대로 정렬 (오름차순)
				displayRecord();									// 저장된 레코드 출력
			} else if (sort == 2) {		// 2번 선택 
				Collections.sort(record, new TotalDescending());	//record를 TotalDescending()의 규칙대로 정렬	(내림차순)
				displayRecord();									// 저장된 레코드 출력
			} else {
				return;				// sortRecord()을 끝냄
			}
		}
	}

	static void displayRecord() {	
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;

		System.out.println();
		System.out.println("이름 번호 국어 영어 수학 총점");
		System.out.println("=================================");

		int length = record.size();		//length는 레코드의 길이 

		if (length > 0) {				// record에 저장된 데이터가 있으면
			for (int i = 0; i < length; i++) {
				Student2 student = (Student2) record.get(i);	//record의 길이만큼 record에 들어있는 객체를 받아옴
				System.out.println(student);					//student의 toString() 형태에 맞게 출력됨
				koreanTotal += student.koreanScore;
				englishTotal += student.englishScore;
				mathTotal += student.mathScore;
				total += student.total;
			}
		} else {						// record에 저장된 데이터가 없으면
			System.out.println();
			System.out.println("테이터가 없습니다.");
			System.out.println();
		}
		System.out.println("=================================");
		System.out.println("총점 : " + Student2.format(koreanTotal + "", 11, Student2.RIGHT)		// Student2의 클래스 메서드 format에
				+ Student2.format(englishTotal + "", 6, Student2.RIGHT)							// 맞춰 총점을 출력
				+ Student2.format(mathTotal + "", 6, Student2.RIGHT) + Student2.format(total + "", 8, Student2.RIGHT));
		System.out.println();

	}
}

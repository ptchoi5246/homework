package hw0320;

import java.util.ArrayList;
import java.util.Scanner;
/*
 	그린중학교 1반에서 3반의 명단이 다음과 같다.
 	이때 ArrayList에 각 반별로 저장시켜놓고, ArrayList에 저장된 각 반의 자료를 출력시켜보자.
 	또, 반를 입력하면 그 반의 학생들을 출력시켜보시오
 	1반 : 홍길동, 김말숙, 이기자
 	2반 : 소나무, 대나무, 감나무, 밤나무
 	3반 : 오사랑, 하나로, 행복해
 */
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String[]> list = new ArrayList<>();
		
		String[] class1 = {"홍길동","김말숙","이기자"};
		list.add(class1);
		
		String[] class2 = {"소나무","대나무","감나무","밤나무"};
		list.add(class2);
		
		String[] class3 = {"오사랑","하나로","행복해"};
		list.add(class3);
		
		System.out.println("학생 명단을 확인하고 싶은 반을 입력하세요~! 1:1반 2:2반 3:3반");
		int choice = sc.nextInt();
		
		System.out.println("그린 중학교 " +choice + "반의 학생 명단입니다.");
		for(int i=0; i<list.get(choice-1).length; i++) { //아직 정확하게는 잘 모르겠어요.....
			System.out.println(list.get(choice-1)[i] + " ");
		} //get(i)
 		
		sc.close();
	}
}

package hw0312;

import java.util.Scanner;

//indexOf() 찾고자 하는 문자(열)가 있는가를 표시
//있으면 위치값(인덱스값)을 반환하고 없으면 -1을 반환

//문장 입력받기
//찾고자하는 문자(열) 입력받기
//문자열 ~번째 인덱스 값에 있다/ 없다

public class Hw0312_indexOf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//먼저 문자(열)을 입력 받는다.		
		
		System.out.println("문장을 입력해주세요.  ");
		String msg = sc.nextLine(); //문장이라 nextLine() 사용
		
		
		while(true) {
		System.out.println("찾고 싶은 단어를 입력하세요.   0.종료");
		String findWord = sc.next();
		if(msg.indexOf(findWord) >= 0) {
			System.out.println("찾고 싶은 단어 '" + findWord +"' 은/는 " + (msg.indexOf(findWord)+1) + "번째 위치하고 있습니다.");
		} else break;
		
				
		int cnt = 0; //단어의 총 등장 횟수
		
		cnt++;
				
		System.out.println("찾고 싶은 단어 '" + findWord + "' 은/는 의 총 등장횟수 : " + cnt);		
		}
		System.out.println("프로그램이 종료되었습니다. 감사합니다 :)");
		sc.close();		
	}
}

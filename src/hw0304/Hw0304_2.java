package hw0304;

import java.util.Scanner;

/* 2. 가위/바위/보 게임
컴퓨터에게 랜덤하게 '가위/바위/보'중의 하나를 기억시켜놓고,
사용자가 '가위/바위/보'중에서 하나를 입력하면, 누가 이겼는지를 출력처리한다.
(단, '그만'을 입력하면 프로그램을 종료처리한다)
 */
public class Hw0304_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user, com;
		boolean run = true;
		
		String[] game = {"가위", "바위", "보"}; // 배열		
				
		while(run) {
			System.out.println("가위, 바위, 보 중 하나를 입력하세요~!  단,'그만'을 입력하면 프로그램은 종료합니다.");
			user = sc.next(); //가위, 바위, 보 입력 Scanner
			
			if(user.equals("가위") || user.equals("바위") || user.equals("보")) {
				com = game[(int)(Math.random()*3)];//랜덤값
			}
			else if(user.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("다시 입력해주세요~!  ");
				continue;
			}
			
			System.out.println("사용자 : " +user+ ", 컴퓨터 : " +com);
			
			if(user.equals("가위")) {
				if(com.equals("가위")) System.out.println("무승부");
				else if(com.equals("바위")) System.out.println("컴퓨터 승!");
				else System.out.println("사용자 승!");
			}
			else if(user.equals("바위")) {
				if(com.equals("가위")) System.out.println("사용자 승!");
				else if(com.equals("바위")) System.out.println("무승부");
				else System.out.println("컴퓨터 승!");
			}
			else {
				if(com.equals("가위")) System.out.println("컴퓨터 승!");
				else if(com.equals("바위")) System.out.println("사용자 승!");
				else System.out.println("무승부");
			}			
			System.out.println();	
		}
		sc.close();		
	}
}
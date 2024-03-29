package hw0229;

import java.util.Scanner;

/* while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해 보세요.
 * 이 프로램을 실행시키면 다음과 같은 실행 결과가 나와야 합니다.
 
 */
public class Hw0229_5a {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0, choice = 0; //balance : 잔액, choice는 숫자로 받기에 미리 선언
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-----------------------------");
			System.out.println("선택>");
			choice = sc.nextInt();
		
			switch(choice) { //switch 사용해서 case 1-4
				case 1:
					System.out.println("예금액을 입력하세요.  ");
					int deposit = sc.nextInt();
					balance = balance + deposit;
					System.out.println("예금이 완료되었습니다. 잔액은 "+balance+"원 입니다.");
					break; //while문, case문 구분하기! 49번을 빠져나간다.
			
				case 2:
					System.out.println("출금액을 입력하세요.  ");
					int withdraw = sc.nextInt();
					if(withdraw > balance) { //잔액 출금액 조건
						System.out.println("잔액이 부족합니다. 현재 잔액은 "+balance+"원 입니다.");
					}
					else //if(withdraw <= balance) {
						balance = balance - withdraw; // balance -= withdraw;
						System.out.println("출금이 완료되었습니다. 현재 잔액은 "+balance+"원 입니다.");
					break;	
				
				case 3:
					System.out.println("현재 잔액은 "+balance+"원 입니다.");
					break;
			
				case 4:
					System.out.println("감사합니다. 안녕히 가세요.");
					break;	
				}
				if(choice == 4) break; //while 전체 빠져나간다, break; 대신에 false
			}				
		sc.close();
	}
} //블럭 맞추기 조심하기!!!

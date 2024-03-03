package hw0229;

import java.util.Scanner;

/* while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해 보세요.
 * 이 프로램을 실행시키면 다음과 같은 실행 결과가 나와야 합니다.
 
 */
public class Hw0229_5 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0, choice = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-----------------------------");
			System.out.println("선택>");
				choice = sc.nextInt();
				
		switch(choice) {
			case 1:
				System.out.println("예금액을 입력하세요.  ");
				int deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("예금이 완료되었습니다. 현재 잔액은 :"+balance+"원 입니다.");
			break;
				
			case 2:
				System.out.println("출금액을 입력하세요.  ");
				int withdraw = sc.nextInt();
					if(withdraw > balance) {
						System.out.println("잔액이 부족합니다. 현재 잔액은 :"+balance+"원 입니다.");
					}
					else if(withdraw <= balance) {
						System.out.println("출금이 완료되었습니다. 현재 잔액은 :"+balance+"원 입니다.");
					}
			break;
				
			case 3:
				System.out.println("현재 잔액은 :"+balance+"원 입니다.");
			break;
			
			case 4:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
			break;	
		
		}
		}
	}
}

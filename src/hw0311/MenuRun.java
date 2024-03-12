
package hw0311;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int ans;
		
		Child child = new Child();
		
		while(true) {
			System.out.println(" * 어린이집 식단 계산 * ");
			System.out.print("어린이의 이름을 입력해 주세요.  ");
			name = sc.next();
			
			System.out.println(name + " 어린이는 쌀밥(500원)과 불고기(2000원)는 기본 제공 됩니다.");
			System.out.println();
			
			int foodTotal = 0; //전체 가격
			while(true) {
				System.out.println("추가 점심 메뉴를 골라주세요. (여러개 선택 가능)");
				System.out.println("1.두부조림 2.미역국 3.선택완료");
				System.out.println("==================================================");
				ans = sc.nextInt();
				if(ans == 3) break;
				
				switch(ans) {
					case 1:
						System.out.println("추가 점심 메뉴 : 두부조림, 가격은 " +child.TOFU+ "원 입니다.");
						foodTotal += child.TOFU;
						System.out.println();
						break;
						
					case 2:
						System.out.println("추가 점심 메뉴 : 미역국, 가격은 " +child.SEAWEED+ "원 입니다.");
						foodTotal += child.SEAWEED;
						System.out.println();
						break;
				}
			}	
			boolean run = true;
			
			while(run) {
				System.out.println("추가 간식 메뉴를 골라주세요. (여러개 선택 가능)");
				System.out.println("1.요거트 2.바나나 3.우유 4.아몬드 0.선택완료");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				ans = sc.nextInt();
				System.out.println();
				
				switch(ans) {
					case 1:
						System.out.println("추가 간식 메뉴 : 요거트, 가격은 " +child.YOGURT+ "원 입니다.");
						foodTotal += child.YOGURT;
						System.out.println();
						break;
						
					case 2:
						System.out.println("추가 간식 메뉴 : 바나나, 가격은 " +child.BANANA+ "원 입니다.");
						foodTotal += child.BANANA;
						System.out.println();
						break;
						
					case 3:
						System.out.println("추가 간식 메뉴 : 우유, 가격은 " +child.MILK+ "원 입니다.");
						foodTotal += child.MILK;
						System.out.println();
						break;
						
					case 4:
						System.out.println("추가 간식 메뉴 : 아몬드, 가격은 " +child.ALMOND+ "원 입니다.");
						foodTotal += child.ALMOND;
						System.out.println();
						break;
					default:
						run = false;
				}
			}
			if(ans == 0) {
				child.MenuPrice(foodTotal);
				System.out.println("프로그램을 종료합니다. 감사합니다.");
				break;
			}
		}
		sc.close();
	}
}	
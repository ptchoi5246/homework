package hw0308;

import java.util.Scanner;

public class BunsikRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int sw = 0;
		
		BunsikService service = new BunsikService();
		Bonsa wangja = new WangjaBunsik();
		Bonsa wooju = new WoojuBunsik();
		Bonsa seoul = new SeoulBunsik();
		
		while(true) {
			System.out.println("==============================");
			System.out.println("분식집을 선택해주세요~!  ");
			System.out.println("1.왕자분식 2.우주분식 3.서울분식 4.종료");
			System.out.println("==============================");
			System.out.println();
			ans = sc.nextInt();
			
			switch(ans) {
				case 1:
					wangja.menuPrice();
					service.Price(wangja);
					break;
					
				case 2:
					wooju.menuPrice();
					service.Price(wooju);
					break;
					
				case 3:
					seoul.menuPrice();
					service.Price(seoul);
					break;
					
				case 4:
					System.out.println("종료합니다.");
					sw = 1;
					break;
			}
			
			if(sw==1) break;
					
		}
		
		sc.close();
	}

}

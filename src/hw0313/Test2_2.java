package hw0313;

import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
		int cnt = 0;
		
		while(true) {
			int sw = 0;
			cnt++;
			System.out.print("아이디를 입력하세요? ");
			String mid = scanner.next();
			
			if(mid.length() < 4 || mid.length() > 20) sw = 1;
			else {
				for(int i=0; i<mid.length(); i++) {
					if(!temp.contains(String.valueOf(mid.charAt(i)))) { //.contains 사용 : 문자열 비교  //처리 속도가 훨씬 빠르다.
						sw = 1; //String.valueOf 공부하기 :문자열로 바꾸기 
						break;
					}
				}
			}
			if(sw == 1) { //포함 안 했을 때
				System.out.println("입력된 아이디는 사용하실수 없습니다.");
				if(cnt == 3) cnt = delayCheck();
			}
			else {
				System.out.println(mid + " 님 환영합니다.");
				break;
			}
		}
		scanner.close();
	}
	
	private static int delayCheck() {
		System.out.println("================================");
		System.out.println("로그인 3번 실패로 10초간 작업이 중지됩니다.");
		for(int i=10; i>0; i--) {
			System.out.print("."+i+".");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		}
		System.out.println("\n다시 로그인해 보세요. 기회는 3번입니다.");
		System.out.println("================================");
		return 0;
	}
}

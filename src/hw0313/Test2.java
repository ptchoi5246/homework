package hw0313;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 입력받는 아이디는 영문자와 숫자와 밑줄(_)만을 허용할 수 있도록 처리하시오.
		String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
		int cnt = 0;
		
		while(true) {
			cnt++; //횟수를 체크하기 위해 처음에 cnt
			System.out.print("아이디를 입력하세요? ");
			String mid = scanner.next();
			
			if(mid.length() < 4 || mid.length() > 20) { //길이가 잘못되었다.
				System.out.println("아이디는 4~20자 이내로 작성하세요.");
				if(cnt == 3) cnt = delayCheck(); //delayCheck 메소드 만들기
				continue;
			}
			
			int sw = 0;
			for(int i=0; i<mid.length(); i++) {
				sw = 0;
				for(int j=0; j<temp.length(); j++) {
					if(mid.charAt(i) == temp.charAt(j)) { //
						sw = 1;
						break;
					}
				}
				if(sw == 0) break;
			}
			if(sw == 0) { //소문자, 대문자, 숫자, 특수문자 일치하지 않으면 sw==0이 그대로 출력
				System.out.println("입력된 아이디는 사용하실수 없습니다.");
				if(cnt == 3) {
					cnt = delayCheck();
					continue;
				}
			}
			else {
				System.out.println(mid + " 님 환영합니다.");
				break;
			}
		}
		scanner.close();
	}

	private static int delayCheck() {
		System.out.println("로그인 3번 실패로 10초간 작업이 중지됩니다.");
		for(int i=10; i>0; i--) {
			System.out.print("."+i+".");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		} //10초간 작업 중지
		System.out.println("\n다시 로그인해 보세요. 기회는 3번입니다.");
		return 0; //3번의 기회를 다 쓰고 10초 중지 - 다시 시작해야 하니까 0 cnt0 초기화를 위해 return 0
	}
}


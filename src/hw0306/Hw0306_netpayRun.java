package hw0306;

import java.util.Scanner;

//실행객체
public class Hw0306_netpayRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //사원코드, 사원명, 직급코드, 초과시간 입력받기
		
		Hw0306_netpayVO vo = new Hw0306_netpayVO(); //입력 객체 생성
		
		System.out.print("사원코드를 입력하세요.");
		vo.setNo(sc.nextInt());
		
		System.out.print("사원명를 입력하세요.");
		vo.setName(sc.next());
		
		System.out.print("직급코드를 입력하세요.");
		vo.setCode(sc.nextInt());
		//if(code.toUppercase().equals("B,K,D,S")) break;
		
		System.out.print("초과시간을 입력하세요.");
		vo.setOverTime(sc.nextInt());
		
		
		
		
		
		
		sc.close();
				
				
	}
}

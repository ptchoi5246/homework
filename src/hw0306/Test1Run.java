package hw0306;

import java.util.Scanner;

//실행객체 :: 오로지 출력을 위함
public class Test1Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //사원코드, 사원명, 직급코드, 초과시간 입력받기
		
		Test1VO vo = new Test1VO(); //입력 객체 생성
		
		Test1Service service = new Test1Service();
		
		while(true) {
			System.out.print("안녕하세요. 사원코드를 입력해주세요.");
			vo.setNo(sc.nextInt()); //사원코드 no 세터
			
			System.out.print("사원명를 입력해주세요.");
			vo.setName(sc.next()); //사원명 name 세터
			
			System.out.print("직급코드를 입력해주세요.");
			vo.setCode(sc.next()); //직급코드 code 받았다가 다시 줘야된다 게터
			
			
			System.out.print("초과시간을 입력해주세요.");
			vo.setOverTime(sc.nextInt()); //초과시간 overTime 세터
			
			vo.setNetPay(service.netPayCheck(vo));
			vo.setJikkup(service.codeCheck(vo.getCode()));
			service.print(vo);			
			
			System.out.println("다른 사원코드를 입력하시겠습니까? (Y:네 계속하기, N:그만하기)");
			String ans = sc.next();
			if(ans.toUpperCase().equals("N")) break;
		}
		
		System.out.println("감사합니다. 안녕히 가세요.");
		
		sc.close();	
				
	}
}

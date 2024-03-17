package hw0315;

import java.util.Scanner;

/*
  아이디 : 영문(대소문자), _, -, 숫자 ==> 4글자 이상{}
  regID = "^[\\w-]{4,}$"; 
  비밀번호 : 영문(대소문자), ~!@#$%^&*()_+-= , 숫자 ==> 6글자 이상{} 
  regPW = "^[\\w~!@#$%^&*()+`-=]{6,}$" 
  성명 : 영문(대소문자), 한글
  regName = "^[a-zA-Z가-힣]+$"
  나이 : 숫자
  regAge = "^[0-9]+$" 
  전화번호 : 02-123-4567, 010-123-4567, 010-1234-5678, 043-123-4567, 043-1234-5678 {}글자길이 활용
  regPhone = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$" "\\d{2,3}-\\d{3,4}-\\d{4}";
  이메일 : patternTest5
  regEmail : "\\w{3,}@[a-zA-T0-9]{1,8}\\.[a-z]{1,4}+$"
  주민번호 : 123456-2345678 // 8번 1,2,3,4 //-사용
  regJumin : "^[0-9]{6}-[1-4]{6}$"
  
  검증
  boolean result = Pattern.matches("정규식","입력된 문자열")
 */
public class Test1_Signup {
	public static void main(String[] args) {
		Test1_SignupService sv = new Test1_SignupService();
		Scanner sc = new Scanner(System.in);
		String ans = "";
		boolean res = true;
		
		while(true) {
			Test1_SignupVO vo = new Test1_SignupVO();
			
			while(res) {
				System.out.println("아이디를 입력하세요~!  ");
				vo.setId(sc.next());
				res = sv.regId(vo);
			}
			res = true;
		
			while(res) {
				System.out.println("비밀번호를 입력하세요~!  ");
				vo.setPwd(sc.next());
				res = sv.regPwd(vo);
			}
			res = true;
			
			while(res) {
				System.out.println("이름를 입력하세요~!  ");
				vo.setName(sc.next());
				res = sv.regName(vo);
			}
			res = true;
			
			while(res) {
				System.out.println("나이를 입력하세요~!  ");
				vo.setAge(sc.next());
				res = sv.regAge(vo);
			}
			res = true;
			
			while(res) {
				System.out.println("전화번호 '-'와 같이 입력하세요~!  ");
				vo.setPhone(sc.next());
				res = sv.regPhone(vo);
			}
			res = true;
			
			while(res) {
				System.out.println("이메일을 입력하세요~!  ");
				vo.setEmail(sc.next());
				res = sv.regEmail(vo);
			}
			res = true;
			
			while(res) {
				System.out.println("주민등록번호를 '-'와 같이 입력하세요~!  ");
				vo.setJumin(sc.next());
				res = sv.regJumin(vo);
			}
			res = true;
			
			sv.print(vo);
			
			System.out.println("계속 하시겠습니까??? (Y: 네. / N: 아니요.)");
			ans = sc.next();
			if(ans.toUpperCase().equals("N")) break;
		}	
		System.out.println("프로그램을 종료합니다~! 감사합니다.");
		
		sc.close();
		}
}	

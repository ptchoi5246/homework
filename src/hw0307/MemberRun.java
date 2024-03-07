package hw0307;

public class MemberRun {
	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		//memberService 객체 만들기
		
		MemberVO user1 = new MemberVO ("홍길동","hong"); //user1
		MemberVO user2 = new MemberVO ("강자바","java"); //user2
		
//		//boolean result = memberService.login("hong","12345"); //login
//		if(result) {
//			System.out.println("로그인 되었습니다.");
//			memberService.logout("hong");
//		}
//		else {
//			System.out.println("id 또는 password가 올바르지 않습니다.");
//		}
		

		
	}
}

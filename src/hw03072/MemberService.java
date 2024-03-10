package hw03072;

public class MemberService {

		

	//메소드
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) return true;
		else return false;
	}
	
	//메소드
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}

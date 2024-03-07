package hw0307;

public class MemberService {

	//리턴타입 : 불린, 메소드이름 : login, 매개변수(타입 : String id, String password)
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) return true;
		else return false;
	}
	
	//리턴타입 : void (return 없음), 메소드이름 : logout, 매개변수(타입: String id)
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}	
}

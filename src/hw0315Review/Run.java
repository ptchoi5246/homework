package hw0315Review;

import java.util.Scanner;

public class Run {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Service service = new Service();
				boolean run = true;
		
		while(run) {
			Vo vo = new Vo();
			while(true) {
				System.out.println("아이디를 입력하세요~!  ");
				String id = sc.next();
				if(id.matches("[\\w-0-9]{4,}$")) {
					vo.setId(id);
					break;
			}
			else System.out.println("아이디는 4자 이상 영문 대,소문자, 특수문자 '-', '_'만 입력 가능 합니다.");
			}
		}
		
		while(run) {
			Vo vo = new Vo();
			while(true) {
				System.out.println("비밀번호를 입력하세요~!  ");
				String pwd = sc.next();
				if(pwd.matches("[\\w`~!@#$%^&*()-+=]{6,}")) {
					vo.setPwd(pwd);
					break;
				}
				else System.out.println("비밀번호는 6자 이상 영문 대,소문자, 특수문자만 입력 가능 합니다.");
			}
		}
		
		while(run) {
			Vo vo = new Vo();
			while(true) {
				System.out.println("이름을 입력하세요~!  ");
				String name = sc.next();
				if(name.matches("[a-zA-Z가-힣]+$")) {
					vo.setName(name);
					break;
				}
				else System.out.println("이름은 영문 대,소문자, 한글만 입력 가능 합니다.");
			}
		}
		
		while(run) {
			Vo vo = new Vo();
			while(true) {
				System.out.println("나이를 입력하세요~!  ");
				String age = sc.next();
				if(age.matches("[0-9]{1,3}$")) {
					vo.setAge(age);
					break;
				}
				else System.out.println("나이는 숫자만 입력 가능 합니다.");
			}
		}
		
		while(run) {
			Vo vo = new Vo();
			while(true) {
				System.out.println("전화번호를 '-'와 같이 입력하세요~!  ");
				String phone = sc.next();
				if(phone.matches("[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$")) {
					vo.setPhone(phone);
					break;
				}
				else System.out.println("전화번호를 다시 확인해주세요.");
			}
		}
		
		while(run) {
			Vo vo = new Vo();
			while(true) {
				System.out.println("이메일을 입력하세요~!  ");
				String email = sc.next();
				if(email.matches("[\\w-]{2,}@[a-zA-Z]+.[a-zA-Z]{3,4}$")) {
					vo.setEmail(email);
					break;
				}
				else System.out.println("잘못된 이메일 형식입니다. 다시 확인해주세요");
			}
		}
		
		while(run) {
			Vo vo = new Vo();
			while(true) {
				System.out.println("주민등록번호를 '-'와 같이 입력하세요~!  ");
				String jumin = sc.next();
				if(jumin.matches("[0-9]{6}-[1-4]{1}[0-9]{6}$")) {
					vo.setJumin(jumin);
					break;
				}
				else System.out.println("주민등록번호를 다시 확인해주세요.");
			}
		}
		
		System.out.println();
		service.membership(Vo);
		
		sc.close();
	
	}
*/
}

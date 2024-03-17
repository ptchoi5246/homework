package hw0315;

import java.util.Scanner;
import java.util.regex.Pattern;
 
public class Test1_SignupService {
  Scanner sc = new Scanner(System.in);
  
  public boolean regId(Test1_SignupVO vo) {   
    String regID = "^[\\w-]{4,}$";
    if(Pattern.matches(regID, vo.getId())) return false;
    else {
     System.out.println("아이디는 4자 이상 영문 대,소문자, 숫자, 특수문자 '-', '_'만 입력가능합니다. \n조건에 맞춰 다시 입력해주세요.");
     return true;
    }
  }
  
  public boolean regPwd(Test1_SignupVO vo) {   
  	String regID = "^[\\w`~!@#$%^&*()-=+]{6,}$";
  	if(Pattern.matches(regID, vo.getPwd())) return false;
  	else {
  		System.out.println("비밀번호는 6자 이상 영문 대,소문자, 숫자, 특수문자 입력가능합니다. \n조건에 맞춰 다시 입력해주세요.");
  		return true;
  	}
  }
  
  
  public boolean regName(Test1_SignupVO vo) {    
  	String regName = "^[가-힣]{1,5}$";
  	if(Pattern.matches(regName, vo.getName())) return false;
  	else {
  		System.out.println("이름은 한글 1자 이상 5자 이하만 입력가능합니다. \n조건에 맞춰 다시 입력해주세요.");
  		return true;
  	}
  }
  
  public boolean regAge(Test1_SignupVO vo) {    
  	String regAge = "^[0-9]{1,3}$";
  	if(Pattern.matches(regAge, vo.getAge())) return false;
  	else {
  		System.out.println("나이는 1자리 이상 3자리 이하 숫자만 입력가능합니다. \n조건에 맞춰 다시 입력해주세요.");
  		return true;
  	}
  }
  
  public boolean regPhone(Test1_SignupVO vo) {    
  	String regPhone = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
  	if(Pattern.matches(regPhone, vo.getPhone())) return false;
  	else {
  		System.out.println("전화번호를 다시 확인해주세요.");
  		return true;
  	}
  }
  
  public boolean regEmail(Test1_SignupVO vo) {    
  	String regEmail = "\\w{3,}@[a-zA-T0-9]{1,8}\\.[a-z]{1,4}+$";
  	if(Pattern.matches(regEmail, vo.getEmail())) return false;
  	else {
  		System.out.println("메일 주소를 다시 확인해주세요.");
  		return true;
  	}
  }
  
  public boolean regJumin(Test1_SignupVO vo) {    
  	String regJumin = "^[0-9]{6}-[1-4][0-9]{6}$";
  	if(Pattern.matches(regJumin, vo.getJumin())) return false;
  	else {
  		System.out.println("주민등록번호를 다시 확인해주세요.");
  		return true;
  	}
  }
   
  public void print(Test1_SignupVO vo) {
		System.out.println("=.=.=.=.=.=회 원 정 보=.=.=.=.=.=");
		System.out.println("아이디 : " + vo.getId());
		System.out.println("비밀번호 : " + vo.getPwd());
		System.out.println("이름 : " + vo.getName());
		System.out.println("나이 : " + vo.getAge());
		System.out.println("전화번호 : " + vo.getPhone());
		System.out.println("이메일 : " + vo.getEmail());
		System.out.println("주민등록번호 : " + vo.getJumin());
  }
}
 


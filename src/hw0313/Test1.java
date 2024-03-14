package hw0313;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] extName = {"jpg","gif","png","hwp","txt","xlsx","zip","pptx"};
		String[] content = {"그림","그림","그림","한글","텍스트","엑셀","압축","파워포인트"};
		//2차원 배열
		//{hwp,한글파일}
		//{jpg,그림파일} ...
		//2차원 배열 숙제 소스 찾아보기
		
		while(true) {
			System.out.println("==================");
			System.out.print("파일명을 입력하세요? ");
			String fileName = sc.next();
			
			int cnt = 0;
			String ext = fileName.substring(fileName.lastIndexOf(".")+1).toLowerCase(); //.toLowerCase : 소문자로 바꾸기
			//.뒤의 확장자를 비교해야하니까 lastIndexOf(".") 사용하기
			for(int i=0; i<extName.length; i++) {
				if(ext.equals(extName[i])) { //.contains(포함) 사용하면 안 된다.
					System.out.println(content[i] + "파일 입니다.");
					break; //배열의 길이만큼 반복
				}
				cnt++;
			}
			if(cnt == extName.length) System.out.println("잘못된 파일입니다.");
			
			System.out.print("계속하시겠습니까?(Y/N) ");
			String ans = sc.next();
			if(ans.toUpperCase().equals("N")) break;
		}
		System.out.println("=> 작업을 종료합니다.");
		sc.close();
	}
}
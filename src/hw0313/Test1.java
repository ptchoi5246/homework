package hw0313;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] engExt = {"jpg","txt","zip","xlsx","hwp","gif"};
		String[] korExt = {"그림파일","텍스트파일","압축파일","엑셀파일","한글파일","그림파일"};
			
		while(true) {
			System.out.println("파일명을 입력하세요~!  ");
			String file = sc.next();
			
			String fileExt = file.substring(file.indexOf(".")+1);
			//.substring(int startIndex) startIndex에서 끝까지 문자열 발췌
			String fileType = "";
			
			for(int i=0; i<engExt.length; i++) {
				if(fileExt.equals(engExt[i])) {
					fileType = korExt[i];
					break;
				}
			}
			System.out.println(file + "===>" + fileType);
			
			System.out.println("계속 할까요? (Y/N)");
			String yn = sc.next();
			if(yn.toUpperCase().equals("N")) break;
			
			System.out.println("==============================");
		}
		System.out.println("감사합니다. 안녕히 가세요 :)");
		sc.close();
	}
}
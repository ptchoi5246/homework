package hw0312;

import java.util.Scanner;

public class Hw0312_Substring2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력하세요~!  0.종료");
			String msg = sc.nextLine();
			if(msg.equals("0")) {
				System.out.println("감사합니다. 안녕히 가세요");
				break;
			}
			System.out.println("입력된 문자열 : " + msg);
			System.out.println("찾고 싶은 문자열을 입력하세요~!");
			String str = sc.nextLine();
			
			int position, totPosition=0, cnt=0;
			
			while(true) {				
				position = msg.indexOf(str);
				if(position == -1) {
					break;
				}
				totPosition += position;
				System.out.println((cnt+1) + "번째 색인번지 : " + totPosition);
				msg = msg.substring(position +1);
				cnt++;
				totPosition++;
			}
			System.out.println(str + "문자는 총 " +cnt+ " 개 있습니다.");
		}
		sc.close();	
	}
}

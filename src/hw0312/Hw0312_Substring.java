package hw0312;

import java.util.Scanner;

//msg.indexOf("찾는 문자열") msg.substring(int startIndex, int ednIndex)
public class Hw0312_Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요~!  ");
		String msg = sc.nextLine();
		System.out.println("입력된 문자열 : " + msg);
		
		System.out.println("찾고자 하는 문자를 입력하세요~!  ");
		String str = sc.nextLine();
		
		int position, totPosition=0, cnt=0;
		
		while(true) {
			position = msg.indexOf(str); //입력된 문자열msg.indexOf(찾는문자열 str)
			if(position == -1) {
				break;
			}
			totPosition += position;
			System.out.println((cnt+1) + "번째 위치(색인번지) : " + totPosition);
			msg = msg.substring(position + 1);
			cnt++;
			totPosition++;
		}
		System.out.println(str + "문자는 총 " +cnt+ " 개 있습니다.");
		sc.next();
	}
}

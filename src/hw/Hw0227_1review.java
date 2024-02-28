package hw;

import java.util.Scanner;

//1번 : 수를 입력받아서 홀수 인지 짝수인지를 판별하시오.

public class Hw0227_1review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		String str = "";
		
		System.out.print("숫자를 입력하세요~!  ");
		su = sc.nextInt();
		
		if (su % 2 == 0) {
			str = "짝수";
		}
		else {
			str = "홀수";
		}
		
		System.out.println("입력하신 숫자 "+su+"는 "+str+" 입니다.");
		
		sc.close();
		
	}
}

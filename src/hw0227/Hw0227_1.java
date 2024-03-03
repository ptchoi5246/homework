package hw0227;

import java.util.Scanner;

//1번 : 수를 입력받아서 홀수 인지 짝수인지를 판별하시오.
public class Hw0227_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		String res;
		
		System.out.print("숫자를 입력하세요~!  ");
		su = sc.nextInt();
		
		if (su % 2 == 0) res = "짝수";
		else res = "홀수";
		
		System.out.println("입력하신 숫자 "+su+"는 "+res+"입니다.");
				
		sc.close();
	}
}

package hw;

import java.util.Scanner;

/*
3번 : 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되,
한줄에 5개씩 출력하는 프로그램을 만드시오.
 */

public class Hw0228_3_1 {
	public static void main(String[] args) {
		
		int su1, c = 0;
				
		Scanner sc= new Scanner(System.in);
		
		System.out.print("두자리 숫자를 입력해주세요!  ");
		su1 = sc.nextInt();
		
		while(su1 > 0) {
			c++;
			System.out.print(su1 + " ");
			su1--;
			if(c == 5) {
				System.out.println();
				c = 0;
			}
		}
		sc.close();
				 
	}

}
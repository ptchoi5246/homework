package hw0228;

import java.util.Scanner;

/*
3번 : 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되,
한줄에 5개씩 출력하는 프로그램을 만드시오.
 */

public class Hw0228_3b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		
		int num = 0, cnt = 0;
		
		System.out.print("두자리 숫자를 입력하세요~!   ");
		num = sc.nextInt();
		
		while (num >= 1) {
			System.out.print(num + "\t");
			num--;
			cnt++;
			if (cnt % 5 == 0)
				System.out.println( );
		}
			
		sc.close();
				 
	}
}


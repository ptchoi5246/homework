package hw;

import java.util.Scanner;

/*
3번 : 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되,
한줄에 5개씩 출력하는 프로그램을 만드시오.
 */

public class Hw0228_3a {
	public static void main(String[] args) {
		
		int num, i = 0, sub, col = 0;
				
		Scanner sc= new Scanner(System.in);
		
		System.out.print("두자리 숫자를 입력해주세요!  ");
		num = sc.nextInt();
		
		if(num >=10 && num <=99) {
			while(i<num) {
				sub = num - i;
				if (col < 4) {
					System.out.print(sub + " "); //세로 출력을 위해 ln 생략
					col++;
				} else {
					System.out.println(sub);
					col = 0;
				}
				
				i++;
			}
		}
		else System.out.println("숫자를 잘못 입력하셨습니다.");
		
		sc.close();
				 
	}

}
package hw;

import java.util.Scanner;

//2번 : 두개의 수를 각각 입력받아서 두개의 수중, 큰수와 작은수를 각각 출력해 주시오.

public class Hw0227_2a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1 = 0, su2 = 0;		
		
		System.out.print("첫번째 숫자를 입력해주세요~!  ");
		su1 = sc.nextInt();

		System.out.print("두번째 숫자를 입력해주세요~!  ");
		su2 = sc.nextInt();
		//if 조건문
		if (su1 > su2) {
			System.out.println("큰 수는 "+su1+" 이고 작은 수는 "+su2+"입니다.");
		}		
		else if (su2 > su1) {
		System.out.println("큰 수는 "+su2+" 이고 작은 수는 "+su1+"입니다.");
		}
		else {
			System.out.println("첫번째 수와 두번째 수는 같습니다.");
		}
		
		sc.close();
	}
}

package hw;

import java.util.Scanner;

//2번 : 두개의 수를 각각 입력받아서 두개의 수중, 큰수와 작은수를 각각 출력해 주시오.

public class Hw0227_2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1;
		int su2;
		
		System.out.print("첫번째 수를 입력하세요!  ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요!  ");
		su2 = sc.nextInt();
		
		if (su1 > su2) {
			System.out.println("큰 수는 "+su1+", 작은 수는 "+su2+" 입니다.");
		}
		else if (su1 < su2) {
			System.out.println("큰 수는 "+su2+", 작은 수는 "+su1+" 입니다.");
		}
		else System.out.println("두 수는 같습니다.");
			
		sc.close(); 
	}
}

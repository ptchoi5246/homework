package hw;

import java.util.Scanner;

//3번 : 1개의 수를 입력받아서 그 수가 2의 배수인지, 3의 배수인지, 5의 배수인지를 각각 구분해서 출력하시오.
//(예시로, 10은 2의 배수이면서 5의 배수가 될수 있도록 출력처리합니다.)

public class Hw0227_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1;
		
		System.out.print("숫자를 입력하세요!  ");
		su1 = sc.nextInt();
		
		if (su1 % 2 == 0) {
			System.out.println("숫자 "+su1+"은 2의 배수 입니다.");
		}
		else if (su1 % 3 == 0){
			System.out.println("숫자 "+su1+"은 3의 배수 입니다.");
			
		}
		else if (su1 % 5 == 0) {
			System.out.println("숫자 "+su1+"은 5의 배수 입니다.");
		}
		else {
			System.out.println("숫자 "+su1+"은 2의 배수도, 3의 배수도, 5의 배수 아닙니다.");
		}
		sc.close();
	}
}

package hw0228;

import java.util.Scanner;

/*
2번 : 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되,
이때 5개항씩 그 결과를 출력시켜주시오.(마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함)
여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.
 */
public class Hw0228_2b___ {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, temp;
		int tot = 0, tot5 = 0, i = 0; //tot : 두개 숫자 사이의 값 합계, tot5 : 5항씩 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요~!  ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요~!  ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
			temp = num1;
		
		if (num1 == num2) {
			tot += num1; //합계 누적
		}
		while (num1 < num2) {
			tot5 += num1;
			num1++;
			i++;
			if (i % 5 == 0 ) {
				System.out.println();
			}
		}
		
			
		sc.close();
	}
}

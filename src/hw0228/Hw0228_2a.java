package hw0228;

import java.util.Scanner;
/*
2번 : 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되,
이때 5개항씩 그 결과를 출력시켜주시오.(마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함)
여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.
 */
public class Hw0228_2a {
	public static void main(String[] args) {
		
		int su1 = 0, su2 = 0, temp = 0;
		int	tot = 0, tot5 = 0, i = 0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해주세요!  ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력해주세요!  ");
		su2 = sc.nextInt();
		
		//temp 사용 :: 두 수 중 앞의 수가 작도록 처리하기 위해서 두 수의 변경 참조
		if(su1 > su2) {
			temp = su1;
			su1 = su2;
			su2 = temp;
		}
		
		temp = su1;
		
		if(su1 == su2) {
			tot += su1;		
		}
		while(su1 < su2) {
			tot5 += su1;
			su1++;
			i++;
			if(i % 5 == 0) {//5개항씩 출력 (tot = tot % 5 == 0);
				System.out.println((su1 - 5) + "부터" +(su1 - 1) + "까지의 합은" + tot5);
				tot = tot + tot5;
				i = 0;
			}
			if(su1 == su2) {
				tot5 += su1;
				tot += tot5;
				System.out.println((su1-i) + "부터" + su1 + "까지의 합은" + tot5);				
			}			
		}
		su1 = temp;
		System.out.println(su1 + "부터" + su2 + "까지의 합은" + tot);
		
		sc.close();
	}
}

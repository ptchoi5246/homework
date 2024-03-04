package hw0229;

import java.util.Scanner;

/* for문을 이용해서 실행결과와 같은 삼각형을 출력하는 코드를 작성해보세요.
        * 
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
        *
*/

public class Hw0229_4b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cnt1, cnt2;
		
		System.out.print("중간별의 갯수를 입력하세요.  단, 홀수여야 합니다.");
		num = sc.nextInt();
		cnt1 = num/2;
		cnt2 = 1;
		
		for(int i = 1; i <= num; i++) {
			for(int j = cnt1 ; j > 0 ; j++) System.out.print(" ");
			for(int k = 0; k < cnt2 ; k++) System.out.print("*");
			
			if(i < num/2+1) {
				cnt1--;
				cnt2+=2;
			}
			else {
				cnt1++;
				cnt2-=2;
			}
			System.out.println();
		}
			
		sc.close();
	}
}

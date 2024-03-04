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
별의 중간 숫자를 입력 받아 위의 삼각형 만들고 아래 삼각형 만들기 ;; 김한나님
*/

public class Hw0229_4a___ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cnt1, cnt2; //num : 입력 받은 수, cnt1 : 공백, cnt2 : 별
		
		while(true) {
		System.out.println("중간 별의 갯수를 입력하세요~! 홀수만 입력 가능 합니다!");
		num = sc.nextInt();
		cnt1 = num/2; // 처음 공백의 갯수(num/2)
		cnt2 = 1; //처음 별의 갯수
		if(num % 2 !=0) break;
		}
		
		for(int i=1; i<=num; i++) {
			for(int j=cnt1; j>0; j--) System.out.print(" "); //공백 출력
			for(int j=0; j<cnt2; j++ ) System.out.print("*"); //별 출력
			
			if(i<(num/2)+1) { //중간별이 출력되는 행(num/2 +1)까지 앞쪽 공백은 행마다 감소하고 별은 2개씩 늘어난다.
				cnt1--;
				cnt2 +=2;
			}
			else { //중간별 이후부터 앞쪽 공백은 행마다 증가하고 별은 두개씩 줄어든다.
				cnt1++;
				cnt2 -=2; 
			}
			System.out.println();
		}
		sc.close();
	}
}

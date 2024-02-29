package hw;

/*1번 : 1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오.
단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오.
이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
*/

public class Hw0228_1a {
	public static void main(String[] args) {
		
		int i = 0, cnt2 = 0, tot2 = 0;
		int cnt3 = 0, tot3 = 0;
		int	cnt5 = 0, tot5 = 0;
		int fin = 0;
		
		//반복문 while
		while(i <= 100) {
			i++; //i가 증가하면서 실행문 실행
			if(i % 2 == 0) {
				cnt2++;
				tot2 += i;
			} 
			else if(i % 3 == 0) { //else 사용 : 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리
				cnt3++;
				tot3 += i;
			}
			else if(i % 5 == 0) {
				cnt5++;
				tot5 += i;
			}//cnt, tot가 이해가 안됨
		}
		
		System.out.println("2의 배수의 갯수 : "+cnt2+" 3의 배수의 갯수 : "+cnt3+" 5의 배수 갯수 : "+cnt5+" " );
		
	//이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
			
		fin = (tot2 + tot3) - tot5;
		System.out.println("2의 배수의 합 + 3의 배수의 합 - 5의 배수의 합 = " +fin );
	}
}

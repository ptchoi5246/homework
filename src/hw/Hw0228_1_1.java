package hw;
/*1번 : 1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오.
단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오.
이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
*/
public class Hw0228_1_1 {
	public static void main(String[] args) {
		
		int cnt2 = 0, cnt3 = 0, cnt5 = 0, i = 0;
		int sum2 = 0, sum3 = 0, sum5 = 0;
		
		//반복문 while
		while(i <= 100) {
			if (i % 2 == 0) cnt2++; //cnt2의 갯수가 계속 더해진다.
			else if(i % 3 == 0) cnt3++; //중복되는 배수 누적처리 위해 else사용
			else if(i % 5 == 0) cnt5++;	
		}
		
		if (i % 2 == 0) sum2+=i;
		if (i % 3 == 0) sum3+=i;
		if (i % 5 == 0) sum5+=i;
		
		System.out.println("2의 배수의 갯수 : "+cnt2+", 3의 배수의 갯수 : "+cnt3+", 5의 배수의 갯수 : "+cnt5);
		System.out.println("2의 배수의 합 + 3의 배수의 합 = 5의 배수의 합은 : "+(sum2 + sum3 - sum5)+"입니다.");
		
	}
}
//콘솔 실행 안됨

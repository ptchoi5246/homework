package hw0228;

/*1번 : 1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오.
단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오. ex) 6 : 2의배수, 3의 배수이지만 2의 배수에 추가
이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
*/

public class Hw0228_1 {
	public static void main(String[] args) {
		int i = 0;
		int num2 = 0, num3 = 0, num5 = 0;
		int sum2 = 0, sum3 = 0, sum5 = 0;
		int tot = 0;
		
		while(i<=100) { //while 반복문
			i++;
			if(i % 2 ==0 ) {
				num2++;
				sum2 += i;//배수의 합 i갯수씩 늘어나서 누적
			}
			else if(i % 3 ==0 ) {
				num3++;
				sum3 += i;
			}
			else if(i % 5 ==0 ) {
				num5++;
				sum5 += i;
			}
		}
		System.out.println("2의 배수의 갯수 "+num2+", 3의 배수의 갯수 "+num3+", 5의 배수의 갯수" + num5);
		
		tot = (sum2 + sum3) - sum5;//
		System.out.println("2의 배수 합 + 3의 배수 합 - 5의 배수 합 : " + tot);
	}	
}



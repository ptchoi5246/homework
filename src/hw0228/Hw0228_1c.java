package hw0228;

/*1번 : 1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오.
단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오. ex) 6 : 2의배수, 3의 배수이지만 2의 배수에 추가
이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
*/

public class Hw0228_1c {
	public static void main(String[] args) {
		int i = 0, cnt2 = 0, cnt3 = 0, cnt5 = 0;
		int tot2 = 0, tot3 = 0, tot5 = 0;
		int sum = 0;
		
		while (i < 100) {
			i++; //빠뜨림!!!!!
			if (i % 2 == 0 ) {
				cnt2++;
				tot2 = tot2 + i;
			}
			else if (i % 3 == 0 ) {
				cnt3++;
				tot3 = tot3 + i;
			}
			else if  (i % 5 == 0 ) {
				cnt5++;
				tot5 = tot5 + i;
			}
		}
		sum = (tot2 + tot3 - tot5);
		
		System.out.println("2의 배수의 갯수 : "+cnt2+", 3의 배수의 갯수 : "+cnt3+", 5의 배수의 갯수 : " + cnt5);
		System.out.println("2의 배수의 합 + 3의 배수의 합 - 5의 배수의 합 =  " +sum);
	}	
}



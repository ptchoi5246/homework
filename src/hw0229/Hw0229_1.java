package hw0229;

//for문을 이용해서 1~100까지의 정수 중 3의 배수의 총합
/*for (for(int i=초기값; 조건식; 증감자){
조건을 만족할 때 수행처리할 내용...
}
*/
public class Hw0229_1 {
	public static void main(String[] args) {
		int tot = 0;
		for ( int i = 0; i < 100; i++) {
			if (i % 3 == 0)
				tot = tot + i;
		}
		System.out.println("1~100까지의 정수 중 3의 배수의 총합 :  " +tot);
	}
}

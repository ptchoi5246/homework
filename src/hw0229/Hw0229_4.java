package hw0229;

/* for문을 이용해서 실행결과와 같은 삼각형을 출력하는 코드를 작성해보세요.
 *
 **
 ***
 ****
 *****
*/

public class Hw0229_4 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

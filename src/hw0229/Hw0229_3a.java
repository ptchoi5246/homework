package hw0229;

/* 중첩 for문을 이용하여 방정식 3x + 6y = 60의 모든 해를 구해서
 	(x,y) 형태로 출력해 보세요.
 	단, x와 y는 10이하의 자연수입니다.
*/

public class Hw0229_3a {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((3*x + 6*y) == 60) {
					System.out.println("x: "+x+", y : " +y); //for문 안에서 x와 y를 선언했으므로 for문 안에서 출력해야 한다.
					cnt++;
				}
			}
		}
		System.out.println("조건을 만족하는 갯수는 "+cnt+"개 입니다."); //for문 밖에서 cnt 갯수 출력
	}
}

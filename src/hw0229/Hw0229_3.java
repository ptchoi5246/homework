package hw0229;

/* 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서
 	(x,y) 형태로 출력해 보세요.
 	단, x와 y는 10이하의 자연수입니다.
*/

public class Hw0229_3 {
	public static void main(String[] args) {
		int  tot = 0;
		
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if((4*x + 5*y) == 60) {
					System.out.println("x = " +x+ " , y = " +y);
					tot++;
				}
			}
		}
		System.out.println("조건을 만족하는 갯수는 "+tot+" 입니다.");
	}
}

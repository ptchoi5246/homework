package hw0304;

/*
 1. 3,6,9 게임
 1~100까지의 수를 차례로 출력하되
 3,6,9 자리는 숫자가 아닌, '짝'이 아는 문자로 대치하시오.
  ex) 1 2 짝 4 5 짝   ...
  28 짝29 짝30 짝31 짝32 짝짝33 짝34 짝35 짝짝36 짝37 짝38 짝짝39 짝40
 */
public class Hw0304_1 {
	public static void main(String[] args) {
		int i = 0, cnt = 0;
		
		while(i<100) {
			System.out.println(i);
			if(i % 10 == 0) {
				cnt++;
			}
		}
	}
}

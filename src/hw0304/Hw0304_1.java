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
		
		
		for(int i=1; i<=100; i++) {
			int su1 = i/10; //i를 10으로 나눈 몫 : 십의 자리
			int su2 = i%10; //i를 10으로 나눈 나머지 : 일의 자리
			
			if (su1 == 3 || su1 == 6 || su1 == 9) { //or 셋 중의 하나, 십의 자리가 3, 6, 9
				if(su2 == 3 || su2 == 6|| su2 == 9) //or 셋 중의 하나, 1의 자리가 3, 6, 9 
					System.out.print("짝짝 ");
				else System.out.print("짝 ");				
			}
			else {
				if(su2 == 3 || su2 == 6|| su2 == 9) //or 셋 중의 하나, 1의 자리가 3, 6, 9
					System.out.print("짝 ");
				else System.out.print(i + " ");
			}
			if (i%10 ==0) System.out.print("\n");
		}
	}
}	

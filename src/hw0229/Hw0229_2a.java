package hw0229;

/* while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
 	눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
 	눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2) 입니다.
 */
public class Hw0229_2a {
	public static void main(String[] args) {
		int noon1 = 0, noon2 = 0;
		
		while(true) {
			noon1 = (int)(Math.random()*6) +1;
			noon2 = (int)(Math.random()*6) +1; //while문 안에 있어야 정상 출력, while문 밖에 있으면 무한 루프
			System.out.println("나온 주사위의 숫자는 "+noon1+", "+noon2+" 입니다.");
			
			if (noon1 + noon2 == 5) break;		
		}
		System.out.println("두 숫자의 합이 5가 되어 게임을 종료합니다.");
	}
}

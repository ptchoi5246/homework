package hw0305;

import java.util.Scanner;

//한글과 짝을 이루는 2개의 배열을 만들고, 사용자로부터 영어 단어를 입력 받으면 한글로 출력하는 프로그램
//단, 처음에 영한사전인지 한영사전인지 선택할 수 있게 만들어야 한다.
public class Hw0305_3_Dictionary2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //영한인지 한영인지 입력 받음
		
		String[][] word = { //단어 - 문자열 2차원 배열
				{"love","사랑"}, {"java","자바"}, {"apple","사과"}, {"banana","바나나"}, {"grape","포도"}
		};
		
		System.out.println("원하는 사전의 숫자를 입력하세요~!  (1.영한사전 / 2.한글사전)");
		int choice = sc.nextInt(); //입력 숫자 (사전 선택) - 숫자니까 int choice
		
		System.out.println("단어를 입력하세요");
		String inputWord = sc.next(); //입력 단어 - 문자열이니까 String
		
		if(choice == 1) { //영한사전 - 영어 입력 -> 한글 출력
			for(int i=0; i<word.length; i++) { //word.length - 행의 크기 행이 앞 괄호 love 입력 0행 1열 출력 / 
				if(word[i][0].equals(inputWord)) {
					System.out.println(word[i][1]);
					break;
				}
				if(i==5) System.out.println("해당 단어를 찾지 못 했습니다.");//
			}
		}
		else {
			for(int i=0; i<word.length; i++) { //한영사전
				if(word[i][1].equals(inputWord)) {
					System.out.println(word[i][0]);
					break;
				}
				if(i==5) System.out.println("해당 단어를 찾지 못 했습니다.");//
			}		
		}
		
		sc.close();
	}
}
//입력된 단어가 아닌 단어 입력 - 해당단어 출력 안됨...

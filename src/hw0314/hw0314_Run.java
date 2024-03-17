package hw0314;

import java.time.LocalDate;
import java.util.Scanner;

public class hw0314_Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate now = LocalDate.now();
		hw0314_SERVICE service = new hw0314_SERVICE();
		
		String[][] members = {
				{"홍길동", "2000-01-01"}, //yyyy-MM-dd
				{"김말숙", "2020-12-31"},
				{"이기자", "2019-05-20"},
				{"소나무", "2024-03-14"},
				{"아톰맨", "2022-11-22"},
				{"에이맨", "2023-12-11"},
				{"오하늘", "2024-03-14"},
				{"최고봉", "2021-03-14"},
				{"으뜸맨", "2023-05-02"},
				{"사랑이", "2024-03-13"},
				{"감나무", "2022-10-10"},
				{"행복맨", "2000-12-12"},
				{"가나다", "2024-02-28"},
				{"오솔길", "2024-03-17"},
		};
		
		boolean run = true;
		int choice;
		
		while(run) {
			System.out.println("==============================");
			System.out.println(" ** 다음 작업을 선택하세요 ** (오늘 날짜 :"+now+")");
			System.out.println("==============================");
			System.out.println("1.전체회원 2.1년 이상된 회원 3.1달 이내 등록한 회원 4.오늘 등록한 회원 0.종료");
			choice = sc.nextInt();
			System.out.println("------------------------------");
					
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();		
	}
}

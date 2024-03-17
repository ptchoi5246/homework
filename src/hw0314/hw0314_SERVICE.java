package hw0314;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class hw0314_SERVICE {
	LocalDate now = LocalDate.now();
	LocalDate target = null;
	
	//전체 회원 리스트 //2차 배열
	public void memberList(String[][] members) {
		int cnt = 0;
		for (int i=0; i<members.length; i++) {
			cnt++;
			System.out.println(cnt + ".\t");
			for(int j=0; j<members[i].length; j++) {
				System.out.println(members[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	//1년 이내 등록한 회원 리스트(명단과 경과된 개월수 출력)
	public void oneYearList(String[][] members) {
		LocalDate oneYear = now.minusYears(1);
		int intOneYear = Integer.parseInt(oneYear.toString().substring(0,4));
		
		for(int i=0; i<members.length; i++) {
			target = editDate(members[i][1]);
			if(intOneYear > target.getYear());{
				System.out.println(members[i][0] + "(" + members[i][1] + ") 가입 후" + target.until(now, ChronoUnit.MONTHS) + "개월 경과");
			}
		}
	}

	private LocalDate editDate(String joinDay) {
		String[] joinArr = joinDay.split("-");
		int yy = Integer.parseInt(joinArr[0]);
		int mm = Integer.parseInt(joinArr[1]);
		int dd = Integer.parseInt(joinArr[2]);
		target = LocalDate.of(yy, mm, dd);
		return target;
	}
}

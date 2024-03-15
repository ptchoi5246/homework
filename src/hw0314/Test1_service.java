package hw0314;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test1_service {
	LocalDate now = LocalDate.now();
	LocalDate target = null;
	
	// 전체 회원 리스트
	public void memberList(String[][] members) {
		int cnt = 0;
		for(int i=0; i<members.length; i++) { //행의 크기
			cnt++;
			System.out.print(cnt + ".\t");
			for(int j=0; j<members[i].length; j++) {
				System.out.print(members[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// 1년 이내 등록한 회원 리스트(명단과 경과된 개월수 출력) //LocalDate() 타입으로
	public void oneYearList(String[][] members) {
		LocalDate oneYear = now.minusYears(1); //시간 계산 -1년
		int intOneYear = Integer.parseInt(oneYear.toString().substring(0,4)); //년도만 발췌
		
		for(int i=0; i<members.length; i++) { //2023과 수치 비교
			target = editDate(members[i][1]); //editDate // 멤버의 i행의 1번 열(날짜)
			if(intOneYear > target.getYear()) {
				System.out.println(members[i][0] + "("+members[i][1]+") / 가입후 " + target.until(now, ChronoUnit.MONTHS) + "개월경과");
			}
		}
	}

	// 한달이내 등록된 회원(명단과 경과일수 출력)
	public void oneMonthList(String[][] members) {
		Date today = new Date(); //Date()타입
		Date date1 = null, date2 = null;
		
		try {
			LocalDate oneMonth = now.minusMonths(1);	// 한달전의 날짜를 구한다.(LocalDate타입을 Date타입으로 변경하기위해 DateTimeFormatter -> String -> Date타입)
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //local date time -> date time formatter 사용
			String strOneMonth = oneMonth.format(dtf); //Strin 문자로 변경
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(strOneMonth);	// 문자형식의 날짜를 Date형식으로 형변환(getTime()계산을 위함)
			//.parse - try-catch 또는 throws
						
			//local date랑 date 비교 불가
			//local date -> date :: simple date format = date time foramtter
			
			for(int i=0; i<members.length; i++) {
				target = editDate(members[i][1]);		// LocalDate타입을 Date타입으로 변환처리한다.
				date2 = new SimpleDateFormat("yyyy-MM-dd").parse(target.format(dtf));
				// 한달전의 날짜(date1)과 회원의 날짜를 비교해서, 한달안에 등록한 회원의 정보를 출력하게 한다.
				if(date1.getTime() < date2.getTime()) { //시간으로 비교
					System.out.println(members[i][0] + "("+members[i][1]+") / " + (today.getTime() - date2.getTime())/(1000*60*60*24) + "일 경과");
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	// 오늘 등록한 회원들의 명단과 경과된 시간을 함께 출력
	public void todayList(String[][] members) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strToday = sdf.format(today);
		Date date1 = null;
		
		try {
			for(int i=0; i<members.length; i++) {
				target = editDate(members[i][1]);		// LocalDate타입을 Date타입으로 변환처리한다.
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				date1 = new SimpleDateFormat("yyyy-MM-dd").parse(target.format(dtf));
				// 오늘날짜(today)와 회원의 날짜를 비교해서, 오늘 등록한 회원의 정보를 출력하게 한다.
				if(strToday.substring(0,10).equals(target.toString().substring(0,10)))  {
					System.out.println(members[i][0] + "("+members[i][1]+") / " + (today.getTime() - date1.getTime())/(1000*60*60) + "시간 경과");
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	// LocalDate형식으로 날자 쎗팅하기
	private LocalDate editDate(String joinDay) {
		String[] joinArray = joinDay.split("-"); //-기준으로 숫자 뽑기
		int yy = Integer.parseInt(joinArray[0]);
		int mm = Integer.parseInt(joinArray[1]);
		int dd = Integer.parseInt(joinArray[2]);
		target = LocalDate.of(yy, mm, dd); //날짜 셋팅
		return target;
	}
	// 날짜 형식 편집하기(yyyy-MM-dd) -> LocalDate형식으로 날자 쎗팅하기
//	private LocalDate editDate(String joinDay) {
//		String temp = joinDay.substring(0,4);
//		String[] joinArray = joinDay.split("-");
//		
//		if(joinArray[1].length() == 1) temp += "-0" + joinArray[1]; //03월 3월 맞추기 위해서 -0을 추가
//		else temp += "-" + joinArray[1];
//		
//		if(joinArray[2].length() == 1) temp += "-0" + joinArray[2]; //01일 1일 맞추기 위해서 -0을 추가
//		else temp += "-" + joinArray[2];
//		
//		int yy = Integer.parseInt(temp.substring(0,4));
//		int mm = Integer.parseInt(temp.substring(5,7));
//		int dd = Integer.parseInt(temp.substring(8,10));
//		target = LocalDate.of(yy, mm, dd);
//		
//		return target;
//	}

}
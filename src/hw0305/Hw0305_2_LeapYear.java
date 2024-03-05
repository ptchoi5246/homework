package hw0305;

import java.util.Scanner;

//년도와 달을 입력하면 해당 년도 월의 마지막 일자를 출력하는 프로그램을 완성하시오
//배열
public class Hw0305_2_LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요~!  ");
		int year = sc.nextInt();
		
		System.out.print("월를 입력하세요~!  ");
		int month = sc.nextInt();
		
		int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year % 400) == 0 || (year % 4) == 0 && (year % 100) != 0)
			day[1] = 29;
		
		System.out.println(year + "년 " + month + "월의 마지막 날짜는 " + day[month-1] + "일 입니다." );
			
		sc.close();
	}
}

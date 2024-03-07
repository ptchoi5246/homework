package hw0306;

public class Test1Service {

	//비즈니스 로직 :: 사용자 지원
	//직급코드 소문자, 대문자
	String codeCheck(String code) {
		if((code.toUpperCase()).equals("B")) return "부장";
		else if((code.toUpperCase()).equals("K")) return "과장";
		else if((code.toUpperCase()).equals("D")) return "대리";
		else if((code.toUpperCase()).equals("S")) return "사원";
		else return "0";		
	}
	
	int sudangCheck(int sudang, int overTime) {
		//수당 = 초과시간 * 25000(sudang)
		int overTimeSudang;
		overTimeSudang = sudang * overTime;
		return overTimeSudang;		
	}
	
	int gongjeCheck(int bonbong, int overTimeSudang) {
		//공제 = (본봉+초과수당) /10 //*0.1로 하려면 double casting
		int gongjehap;
		gongjehap = (bonbong + overTimeSudang) / 10;
		return gongjehap;
	}

	public void print(Test1VO vo) {	//출력
		System.out.println("사원코드: "+vo.getNo()+"번 / 사원명: "+vo.getName()+"님 / 직급: "+vo.getJikkup()+
				"("+vo.getCode().toUpperCase()+") / 실수령액: "+vo.getNetPay()+"원" );
	}

	public int netPayCheck(Test1VO vo) { // 계산
		// 본봉구하기
		vo.setBonbong(bonbongCalc(vo.getCode()));
		
		// 수당구하기
		vo.setOverTimeSudang(overtimesudangCalc(vo.getOverTime(),vo.getSudang()));
		
		// 공제액 계산
		vo.setGongje(gongjeCalc(vo.getBonbong(),vo.getOverTimeSudang()));
		
		//실수령액 = 본봉 + 수당 - 공제액
		int netpayhap;
		netpayhap = vo.getBonbong() + (vo.getOverTime()*vo.getSudang()) - vo.getGongje();
		return netpayhap;
		// System.out.println("본봉 : " + vo.getBonbong() + " , 시간 : " + vo.getOverTime() + " ,
		// 수당 : " + vo.getSudang() + " , 공제: " + vo.getGongje());		
	}
	
	// 본봉계산을 위해서 직급코드 넘겨받음
	private int bonbongCalc(String code) {
		if(code.toUpperCase().equals("B")) return 5000000;
		else if(code.toUpperCase().equals("K")) return 4000000;
		else if(code.toUpperCase().equals("D")) return 3000000;
		else if(code.toUpperCase().equals("S")) return 2000000;
		else return 0;
	}
	
	// 오버타임 수당 계산
	private int overtimesudangCalc(int overTime, int sudang) {
		return overTime * sudang;
	}
	// 공제액계산
	private int gongjeCalc(int bonbong, int overTimeSudang) {
		return (bonbong + overTimeSudang) / 10;
	}
	
}

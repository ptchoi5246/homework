package hw0306;

public class Test1VO {
	//변수 객체
	int no; //사원코드
	String name; //사원명
	String code; //직급코드
	int bonbong; //본봉	
	int overTime; //초과시간
	int sudang = 25000;
	int overTimeSudang; //초과수당 : 초과시간 * 수당25000	
	int gongje; //공제액
	int netPay; //실수령액
	String jikkup; //직급코드 문자열 저장
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getBonbong() {
		return bonbong;
	}
	public void setBonbong(int bonbong) {
		this.bonbong = bonbong;
	}
	public int getOverTime() {
		return overTime;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	public int getOverTimeSudang() {
		return overTimeSudang;
	}
	public void setOverTimeSudang(int overTimeSudang) {
		this.overTimeSudang = overTimeSudang;
	}
	public int getGongje() {
		return gongje;
	}
	public void setGongje(int gongje) {
		this.gongje = gongje;
	}
	public int getNetPay() {
		return netPay;
	}
	public void setNetPay(int netPay) {
		this.netPay = netPay;
	}
	public String getJikkup() {
		return jikkup;
	}
	public void setJikkup(String jikkup) {
		this.jikkup = jikkup;
	}

	
}

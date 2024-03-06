package hw0306;

public class Hw0306_netpayVO {
	//변수 객체
	int no; //사원코드
	String name; //사원명
	int code; //직급코드
	int overTime; //초과시간
	int netPay; //실수령액 = 본봉 + 수당 -공제액
	int sudang; //수당 = 초과시간 * 25000 / sudang = (overTime * 25000); 
	int gongje; //공제 = (본봉+초과수당)*0.1 / gongje = (bonbong+sudang)*0.1;
	int bonbong; //본봉
	
	
	//게터, 세터 생성
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
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getOverTime() {
		return overTime;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	public int getNetPay() {
		return netPay;
	}
	public void setNetPay(int netPay) {
		this.netPay = netPay;
	}
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	public int getGongje() {
		return gongje;
	}
	public void setGongje(int gongje) {
		this.gongje = gongje;
	}
	public int getBonbong() {
		return bonbong;
	}
	public void setBonbong(int bonbong) {
		this.bonbong = bonbong;
	}
	
}

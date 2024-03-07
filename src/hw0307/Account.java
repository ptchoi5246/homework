package hw0307;
//Service
public class Account {
	//필드
	private int balance; //잔고
	
	//static final 상수 : 전체 대문자
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
		
	//private - 세터, 게터 사용 & 유효성 검사
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) { //유효성 검사
		if(balance <= MIN_BALANCE || balance >= MAX_BALANCE) balance = balance + 0;			
		else this.balance = balance;
	}	
}
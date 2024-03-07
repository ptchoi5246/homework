package hw0307;
//Run
public class AccountExample {
	public static void main(String[] args) {
		//객체 생성
		Account account = new Account();
		
		account.setBalance(10000); 
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100); //유효성 검사
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000); //유효성 검사
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000); 
		System.out.println("현재 잔고 : " + account.getBalance());
	}
}
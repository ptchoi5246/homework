package hw0311;

public class Child implements LunchMenu{

	@Override
	public void MenuPrice(int tot) {
		tot += RICE + BULGOGI; //기본 제공 메뉴
		System.out.println("전체 가격은 " +tot+ "원 입니다.");
	}	
}
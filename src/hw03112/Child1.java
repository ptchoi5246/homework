package hw03112;

public class Child1 implements LunchMenu {
	int MenuPrice; 

	@Override
	public void baseMenu() {
		System.out.println("쌀밥과 불고기는 기본 메뉴 입니다.");
		MenuPrice += RICE + BULGOGI;
	}

	@Override
	public void rice() {}

	@Override
	public void bulgogi() {}

	@Override
	public void tofu() {}

	@Override
	public void seaweed() {}

	@Override
	public void yogurt() {}

	@Override
	public void banana() {
		System.out.println("추가 간식 바나나, 500원 입니다.");
		MenuPrice += BANANA;
	}

	@Override
	public void milk() {}

	@Override
	public void almond() {}

	@Override
	public void MenuPrice() {
		System.out.println("식대 총합은 " + MenuPrice + "원 입니다.");
	}
	
	

}

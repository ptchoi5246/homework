package hw03112;

public class Child2 implements LunchMenu {
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
	public void banana() {}

	@Override
	public void milk() {
		System.out.println("추가 간식 우유, 500원 입니다.");
		MenuPrice += MILK;
	}

	@Override
	public void almond() {
		System.out.println("추가 간식 아몬드, 700원 입니다.");
		MenuPrice += ALMOND;
	}

	@Override
	public void MenuPrice() {
		System.out.println("식대 총합은 " + MenuPrice + "원 입니다.");
	}
	
	

}

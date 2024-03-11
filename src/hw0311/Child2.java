package hw0311;

public class Child2 implements LunchMenu{ //rice, bulgogi, milk, almond

	@Override
	public void rice() {
		System.out.println("쌀밥 \t 500원");		
	}

	@Override
	public void bulgogi() {
		System.out.println("불고기 \t 2000원");
	}

	@Override
	public void tobu() {}

	@Override
	public void miyeok() {}

	@Override
	public void yoghurt() {}

	@Override
	public void banana() {}

	@Override
	public void milk() {
		System.out.println("우유 \t 500원");
	}

	@Override
	public void almond() {
		System.out.println("아몬드 \t 700원");
	}
	

}

package hw0311;

public class Child1 implements LunchMenu{ //rice, bulgogi, banana

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
	public void banana() {
		System.out.println("바나나 \t 500원");
	}

	@Override
	public void milk() {}

	@Override
	public void almond() {}
	

}

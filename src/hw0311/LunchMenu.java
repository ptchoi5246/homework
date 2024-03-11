package hw0311;

public interface LunchMenu  {

	void rice();
	void bulgogi();
	void tobu();
	void miyeok();
	void yoghurt();
	void banana();
	void milk();
	void almond();
	
	default void name(String name) {
		System.out.println(name + " 의 식대 계산 입니다.");
	}
}

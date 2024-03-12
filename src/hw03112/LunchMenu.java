package hw03112;

public interface LunchMenu {
	//요금 고정 - 상수
	int RICE = 500;
	int BULGOGI = 2000;
	int TOFU = 1000;
	int SEAWEED = 1000;
	int YOGURT = 800;
	int BANANA = 500;
	int MILK = 500;
	int ALMOND = 700;
	
	//추상 메소드 - 실행블록 없어야한다.
	
	void baseMenu(); //기본 메뉴 = 밥, 불고기
	void rice();
	void bulgogi();
	void tofu();
	void seaweed();
	void yogurt();
	void banana();
	void milk();
	void almond();
	void MenuPrice(); //식대 총합
}

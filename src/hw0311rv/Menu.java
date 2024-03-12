package hw0311rv;
//!!인터페이스
public interface Menu { //배열 사용
	//타입이 같아서 메뉴와 가격 같은 순서
	//interface 필드 :: public static final 생략 :: 상수개념-대문자, 초기값 변경 불가, 
	String[] FOOD = {"두부조림", "미역국", "요플레", "바나나", "우유", "아몬드"}; //String 타입 - 메뉴
	int[] PRICE = {1000,1000,800,500,500,700}; // int 타입 - 가격
	String[] CHOICE_FOOD = new String[FOOD.length]; //선택된 간식의 이름 저장
	int BASIC_PRICE = 2500;	// 쌀밥 + 불고기
	
	//추상 메소드(실행 블록 없다) - 인터페이스의 기본
	//public abstract 생략
	void foodCalcPrint();
	
	void foodCalc(int i);
	
	//예외 - default, static //실행 블록을 입력해야해서 default 적어두기
	//생략 가능
  default void lunchCalc(int i) {
  	foodCalc(i);
  };
}

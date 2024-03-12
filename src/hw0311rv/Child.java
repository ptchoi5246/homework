package hw0311rv;
//구현객체
public class Child implements Menu { 
	private int total = BASIC_PRICE; //2,500 기본값
	//추상 메소드(실행 블록이 없으니까)만 오버라이드 가능 - 2개
	@Override
	public void foodCalcPrint() {
		int sw = 0;
		System.out.println("===============================================");
		System.out.println("기본제공 : 쌀밥\t불고기");
		System.out.print("선택간식 : ");
		for(int i=0; i<CHOICE_FOOD.length; i++) {
			if(CHOICE_FOOD[i] != null) { //필드 초기선언시 기본값 String - null
				System.out.print(CHOICE_FOOD[i] + "\t");
				sw = 1; //하나라도 선택했다면 sw==1
			}
		}
		if(sw == 0) System.out.print("선택간식없음");
		System.out.println();
		System.out.println("총 식대 : " + String.format("%,d", total) + "원");
		System.out.println("===============================================");
	}

	@Override
	public void foodCalc(int i) { //선택 메뉴 금액 누적
		total += PRICE[i];
		CHOICE_FOOD[i] = FOOD[i]; //CHOICE_FOOD : 누적 메뉴 / FOOD : 메뉴
	}

}

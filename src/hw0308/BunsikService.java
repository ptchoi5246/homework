package hw0308;

public class BunsikService {
	public void Price(Bonsa menuPrice) {
		System.out.println("==============="+menuPrice.getStore()+"메뉴판===============");
		System.out.println("=============================================");
		System.out.println("김치찌개\t\t\t"+menuPrice.getKimchi());
		System.out.println("부대찌개\t\t\t"+menuPrice.getBoodae());
		System.out.println("비빔밥\t\t\t"+menuPrice.getBibimbap());
		System.out.println("순대국\t\t\t"+menuPrice.getSoondaegook());
		System.out.println("공기밥\t\t\t"+menuPrice.getRice());
		System.out.println("=============================================");
	}
}

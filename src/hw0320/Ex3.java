package hw0320;

import java.util.TreeSet;

// Lotto 6개의 당첨 번호를 중복을 배제해서 오름차순 출력하시오
//단, set계열 객체 사용

public class Ex3 {
	public static void main(String[] args) {
		//TreeSet<Integer> treeSet = new TreeSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<>();
		//Set<Integer> treeSet = new TreeSet<>();
		
		for(int i=0; i<6; i++) {
			treeSet.add((int)(Math.random()*45)+1);
		}
		System.out.println("이번주 로또 번호는~!~!~! " + treeSet); //오름차순으로 정렬되어 출력
	}
}

package hw0320;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Lotto 6개의 당첨 번호를 중복을 배제해서 오름차순 출력하시오
//단, ArrayList 객체 사용

public class Ex2 {
	public static void main(String[] args) {
    
    List<Integer> lottoNumbers = new ArrayList<>();

    for(int i=0; i<6; i++) {
    	lottoNumbers.add((int)(Math.random()*45)+1);
			for(int j=0; j<i; j++) {
				if(lottoNumbers.get(i) == lottoNumbers.get(j)) {
					lottoNumbers.remove(i);
					i--;
					break;
				}
			}
		}
       
    Collections.sort(lottoNumbers);
    System.out.print("이번주 로또 번호는~!~!~!  " + lottoNumbers);
	}
}

package hw0320;

import java.util.ArrayList;
import java.util.List;

//max, min, /sort /search /merge /통계(누적)
/*정렬 Array t1-T3 참조
	10개의 난수(10~100) math.random 를 발생시켜서 ArrayList 깨체에 저장시킨 후
			ArrayList<Integer> vos = new ArrayList<>();
		for(int i=0; i<10; i++) {
			vos.add((int)(Math.random()*100)+1);
		}
		System.out.println("1.vos : " + vos);
	원본/오름차순 정렬/내림차순 정렬 자료를 출력하시오.(ArrayList객체를 이용하시오) 넣을때 : vos.add 꺼낼때 vos.get(index i)
	index sort, bubble sort 사용	
 */
public class Ex1 {
	public static void main(String[] args) {
		
		List<Integer> vos = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			vos.add((int)(Math.random()*100+1-10)+10);
			for(int j=0; j<i; j++) {
				if(vos.get(i) == vos.get(j)) {
					vos.remove(i);
					i--;
					break;
				}
			}
		}
		
		System.out.println("원본 자료 : " + vos );
		
    //System.out.println("오름차순 정렬 : " + );
    
    //System.out.println("내림차순 정렬 : " + );
    		
	}
}

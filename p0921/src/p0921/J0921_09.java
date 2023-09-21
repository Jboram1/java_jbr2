package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class J0921_09 {

	public static void main(String[] args) {

		ColAction col = new ColAction();
		
		//list출력, list2출력
		//HashMap으로 list,list2 2개를 포함해서 넘겨받음
		HashMap<String, Object> map = col.scoreAll();
		
		
		//list출력
		ArrayList<StuScore> list = (ArrayList<StuScore>)map.get("list");
		for(int i=0;i<list.size();i++) {
			StuScore s = list.get(i);
			System.out.printf("%s,%d,%d,%d\n",
					s.getName(), s.getKor(),s.getEng(),s.getMath());
		}
		
		
		//list2출력
		ArrayList<Car> list2 = (ArrayList<Car>)map.get("list2");
		for(int i=0;i<list2.size();i++) {
			Car c = list2.get(i);
			System.out.printf("%s,%d\n",c.getColor(),c.getDoor());
		}
		
		
		
		
		
		
		//list2를 전달받아, 출력하시오.
//		ArrayList<Car> list = col.scoreAll();
//		for(int i=0;i<list.size();i++) {
//			Car c = list.get(i);
//		System.out.printf("%s,%d\n",c.getColor(),c.getDoor());
//		
//		}
		
		
		//list를 전달받아, 출력하시오.
//		ArrayList<StuScore> list = col.scoreAll();
//		for(int i=0;i<list.size();i++) {
//			StuScore s = list.get(i);
//			System.out.printf("%s,%d,%d,%d\n",
//					s.getName(), s.getKor(),s.getEng(),s.getMath());
//		}
//		
		
		
		
		
		//카드 52장 출력
//		Card[] card = col.cardInsert();
//		for(int i=0;i<card.length;i++) {
////			System.out.println(card[i].getKind());
////			System.out.println(card[i].getNumber());
//			System.out.println(card[i].getKind()+","+card[i].getNumber());
//		}
		
		
		
		
		
		
		
		
		
		
		//카드1장출력
//		Card c = col.cardInsert();
//		System.out.println(c.getNumber()+","+ c.getKind());
		
		
		
		
		
		
		
		
	}//main

}//class

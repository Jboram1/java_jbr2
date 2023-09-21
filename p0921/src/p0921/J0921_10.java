package p0921;

public class J0921_10 {
	public static void main(String[] args) {
		
		ColAction col2 = new ColAction();
		//52장의 카드 출력
		
		
		
		Card[] card = col2.cardInsert();
		for(int i=0;i<card.length;i++) {
			System.out.println(card[i].getKind()+","+card[i].getNumber());
		}
		
		
		
	}

}

package p0912;

public class J0912_08_card {

	public static void main(String[] args) {
		
		
		
		Deck d = new Deck();
		d.cardPrint();
		d.shuffle();
		System.out.println("=============");
		d.cardPrint();
		
		
		System.out.println("----------------");
		System.out.println("카드 한장 출력 :");
		System.out.println(d.pick(3));
		System.out.println("-----------------");
		System.out.println(d.pick());
		
		
		
		
		
		
		//12장 - Spade, 1-13
		
//		Card[] c = new Card[13];
//		
//		for (int i=0;i<c.length;i++) {
//			c[i] = new Card(); 
//			c[i].kind = "Spade";
//			c[i].number = i+1;
//			System.out.println(c[i]);
//		}
		
//		String[] shape = {"Spade","Diamond","Heart","Clover"};
//		Card[] c = new Card[52];
//		
//		for (int i=0;i<c.length;i++) {
//			c[i] = new Card(); 
//			c[i].kind = shape[i/13];
//			c[i].number = (i%13)+1;
//			System.out.println(c[i]);
//		
//		}
		

		
		
		
		
//		Card c = new Card();
//		c.kind = "Spade";
//		c.number = 1;
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 2;
//		
//		System.out.println(c);
//		System.out.println(c2);

		
		
		
		
		
	}//main

}

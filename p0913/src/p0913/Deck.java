package p0913;


public class Deck {

	String [] shape = {"Heart","Spade","Diamond","Clover"};
	Card [] c = new Card[52];
	
	
	Deck() {
	for(int i=0;i<c.length;i++) {
		c[i] = new Card(shape [i/13],i%13+1);
	}
	}//Deck
	
	Card pick(int no) {
		if(no>52) {
			System.out.println("숫자를 잘못선택하셨습니다.");
			return c[no%52];
		}
		return c[no];
	}
	
	
	
	Card pick() {
		int random = (int)(Math.random()*52);
		return c [random];
	}
	
	void shuffle() {
		for(int i=0;i<500;i++) {
			int random = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}//for
		
	}//void
	
	
	void cardPrint() {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	
	
	
	
	
}

package p0912;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){ //기본생성자
		this("white","auto",5); //다른생성자 호출시 this() , this는 문장의 제일 첫번째에만 올 수 있다.
	} 
	
	Car(Car c){
		this(c.color, c.gearType, c.door); //this 다른생성자호출
	}
	
	
	Car(String color, String gearType, int door){ //보통은 이렇게 씀, 그러나 this를 쓸때도 있다.
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}

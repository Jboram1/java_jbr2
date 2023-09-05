package p0831;

public class Jbr_02 {

	public static void main(String[] args) {
		
		//이름 : 홍길동
		//국어점수 :98
		//영어점수 :99
		//수학점수 :100
		//국어2점수 :90
		//합계 :387
		
		
		String name = "홍길동";
		int kor = 98;
		int eng = 99;
		int math = 100;
		int kor2 = 90;
		int total = kor+eng+math+kor2;
		
		System.out.println("국어점수 :"+kor);
		System.out.println("영어점수 :"+eng);
		System.out.println("수학점수 :"+math);
		System.out.println("국어2점수 :"+kor2);
		System.out.println("합계 :"+total);

	}

}

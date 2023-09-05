package p0831;

public class Jbr_01 {

	public static void main(String[] args) {
		// 국어, 영어, 수학, 국어2 평균을 출력 소수점 3자리까지 출력하시오.
		//100,100,99,80
		
		
		int kor =100;
		int eng =100;
		int math =99;
		int kor2 =80;
		int total =kor+eng+math+kor2;
		double avg =total/4.0;
		
		System.out.printf("평균 :%.2f \n",avg);
		
		
		
		//당신의 나이는 30세, 사는 곳은 서울특별시 구디 입니다.
		
		int age =30;
		String address = "서울특별시 구디";
		
		System.out.println("당신의 나이는 "+age+"세, 사는 곳은 "+address+" 입니다.");
		System.out.printf("당신의 나이는 %d세, 사는 곳은 %s 입니다. \n",age,address);
		
	
		
		

	}

}

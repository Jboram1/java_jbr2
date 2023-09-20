package p0920;

public class J0920_15 {

	public static void main(String[] args) {

		int a = -5;
		System.out.println(Math.abs(a));// 절대값
		
		double b = 12.912;
		System.out.println(Math.ceil(b));//소수점 첫째자리 올림
		System.out.println(Math.floor(b));//소수점 첫째자리 버림
		System.out.println(Math.round(b));// 반올림
		
		int no1 = 10;
		int no2 = 15;
		int no3 = 13;
		
		System.out.println(Math.max(no1, no2)); //최대값 추출
		System.out.println(Math.min(no1, no2)); //최소값 추출
		
		
		System.out.println("3------------------------");
		// 3개의 no1, no2, no3 최대값과 최소값을 출력하시오. (여러개일때
		System.out.println(Math.max(Math.max(no1, no2),no3));
		System.out.println(Math.min(Math.min(no1, no2),no3));
		
		//퀴즈
		//no1,no2,no3 적은숫자 순으로 출력하시오. 10,13,15
		
		
		
		
		
		System.out.println("4------------------------");
		int max1 = (no1 > no2) ? no1 : no2;
		int max2 = (max1 > no3) ? max1 : no3;
		int min1 = (no1 < no2) ? no1 : no2;
		int min2 = (min1 < no3) ? min1 : no3;
		int middle1 = (no1 > no2) ? no2 : no1;
		int middle2 = (middle1 > no3) ? middle1 : no3;

//		System.out.printf("가장큰수 %d 두번째큰수 %d 작은수 %d", max2, middle2, min2);
		System.out.printf("%d , %d , %d", min2, middle2, max2);
		System.out.println();
		System.out.printf("가장작은수 %d 두번째큰수 %d 가장큰수 %d", min2, middle2, max2);
		
	}

}

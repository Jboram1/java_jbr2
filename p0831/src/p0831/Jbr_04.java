package p0831;

import java.util.Scanner;

public class Jbr_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		// 이름, 국어, 영어, 수학, 국어2, 합계, 평균
		String name ="정보람";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int kor2 = 0;
		
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = scan.nextInt();
		System.out.println("국어2점수를 입력하세요.");
		kor2 = scan.nextInt();
		
		
		int total =kor+eng+math+kor2;
		double avg = total/4.0;
		
		System.out.printf("합계 :%d \n" ,total);
		System.out.printf("평균 :%.2f \n", avg);
		
		System.out.printf("국어 : %d, 영어 : %d, 수학: %d, 국어2 : %d, 합계 : %d, 평균 : %.2f \n",kor,eng,math,kor2,total,avg );

	}

}

package p0905;

import java.util.Scanner;

public class J0905_연습2 {

	public static void main(String[] args) {
		
		// 1-100 랜덤숫자를 생성해서 맞추는 프로그램
				// 1. 랜덤숫자를 생성
				// 2. while문 반복
				// 3. num 숫자입력받기
				//4. if를 사용해서 랜덤숫자와 입력숫자가 맞는 비교
				//5. 큰수, 작은수, 정답 - break;
				// 초기식, 조건식, 증감식
		Scanner scan = new Scanner(System.in);
		int [] num = new int [10];
		int random = (int)(Math.random()*100)+1;
		
		int i = 0;
		while(i<10) {
			System.out.println("숫자를 입력하시오.");
			int num2 = scan.nextInt();
			num [i] = num2;
			if (random==num2) {
				System.out.println("정답입니다.");
				break;
			}else if(random>num2) {
				System.out.println("입력한 숫자보다 큰수입니다!!");
			}else {
				System.out.println("입력한 숫자보다 작은수입니다!!");
			}
			
			i++;
		}
		
		System.out.println("입력한 숫자 : ");
		for (int j=0;j<=i;j++) {
			System.out.printf("%d ",num[j]);
		}
		System.out.println();
		System.out.println("랜덤 숫자 : "+random);
		
		
		
		
		//구구단 세로출력
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[  %d단  ] \t",i);
//		}
//		System.out.println();
//		
//		
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//		}
		
		
		
		//구구단 세로출력
//		
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[  %d단  ] \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \n",i,j,i*j);
//			}
//		
//			System.out.println("-----------");
//		}

	} //main
} //class

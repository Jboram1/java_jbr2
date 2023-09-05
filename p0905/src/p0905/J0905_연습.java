package p0905;

import java.util.Scanner;

public class J0905_연습 {

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
			int num2  = scan.nextInt();
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
			System.out.printf("%d ", num[j]);
		}
		
		System.out.println();
		System.out.println("랜덤숫자 :"+random);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan =  new Scanner(System.in);
//		int [] num = new int [10];
//		
//		int random = (int)(Math.random()*100)+1;
//		
//		int i = 0;
//		
//		while(i<10) {
//			System.out.println("숫자를 입력하세요.");
//			int num2 = scan.nextInt();
//			num [i] = num2;
//		    if(random==num2) {
//		    	System.out.println("정답입니다.");
//		    	break;
//		    }else if(random>num2) {
//		    	System.out.println("입련한 수보다 큰수입니다!!");
//		    }else {
//		    	System.out.println("입력한 수보다 작은수입니다!!");
//		    }
//		    
//		    i++;
//			
//		}
//		
//		System.out.println("입력한 숫자 : ");
//		for (int j=0;j<=i;j++) {
//			System.out.printf("%d ", num[j]);
//		}
//		
//		System.out.println();
//		
//		System.out.println("랜덤숫자 : "+random);
		
		
		
		
		
		
		
		
		
//		// 1-100 랜덤숫자를 생성해서 맞추는 프로그램
//		Scanner scan = new Scanner(System.in);
//		int[] num = new int [10];
//		
//		int random = (int)(Math.random()*100)+1;
//		
//		int i = 0;
//		while(i<10) {
//			System.out.println("숫자를 입력하세요.");
//			int num2 = scan.nextInt();
//			num[i] = num2;
//			
//			if(random==num2) {
//				System.out.println("정답입니다.");
//				break;
//			}else if(random>num2) {
//				System.out.println("입력한 숫자보다 큰수입니다!!");
//			}else {
//				System.out.println("입력한 숫자보다 작은수입니다!!");
//			}
//			
//			i++;
//			
//		} //while
//		
//		System.out.println("입력한 숫자 : ");
//		for (int j=0;j<=i;j++) {
//			System.out.printf("%d " , num[j]);
//		}
//		
//		System.out.println();
//		System.out.println("랜덤 숫자 : "+random);
		
		
		
		
		
		
		
	} //main
} //class

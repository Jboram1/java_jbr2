package p0905;

import java.util.Arrays;
import java.util.Scanner;

public class J0905_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10]; // 배열 10개 생성
		
		//1-100까지 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
		
		//1. 랜덤숫자 생성
		int random = (int)(Math.random()*100)+1; //1-100
		int i=0; //초기식
		
		//2. while 무한반복
		while(i<10) { //10번의 시도만 가능하게 함.
		
			 //3. num 숫자입력받기
			 System.out.println("숫자를 입력하세요.>>");
				int num2 = scan.nextInt();
				num[i] = num2; //입력한 숫자를 배열에 저장
				//4. if를 사용해서 랜덤숫자와 입력숫자가 맞는 비교
				//5. 큰수, 작은수, 정답 - break;
				if(random==num2) {
					System.out.println("정답입니다.");
					break;
				}else if(random>num2) {
					System.out.println("입력한 숫자보다 큰수입니다.!!");
				}else {
					System.out.println("입력한 숫자보다 작은 수입니다.!!");
				}
				
				if(i==9) {
					break;
				}
				
				i++; //증감식
			}//while	
		
		System.out.print("입력한 숫자 : ");
		
		for(int j=0;j<=i;j++) {
			System.out.printf("%d ", num[j]);
		}
		System.out.println();
		
		
		System.out.println("랜덤 숫자 : "+random);
		
		
		
		
//		System.out.println(num); // 주소값이 출력
//		System.out.println(Arrays.toString(num)); //배열의 모든값을 출력
		

		
		
	} //main
} //class

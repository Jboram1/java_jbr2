package p0904;

import java.util.Scanner;

public class J0904_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 10,5 두수를 입력받아, 큰수를 출력하시오.
		// 1. 두수를 입력받아 출력하시오.
		// 2. 두수를 비교해서 큰수 출력하시오.
		
		//두수를 입력
		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
		// 두수를 비교
		if (num1>num2) {
			System.out.println("큰 수 : "+num1);
			System.out.println("작은수 : "+num2);
		}else if(num1<num2){
			System.out.println("큰 수 : "+num2);
			System.out.println("작은수 : "+num1);
		}else {
			System.out.println("두수가 같습니다.");
		}
		
		
		//두수를 출력
		System.out.printf("첫 번째: %d, 두 번째: %d \n", num1,num2); //입력이 잘 되었는지 확인 하는 것이 중요.
		
		

	} //main
} //class

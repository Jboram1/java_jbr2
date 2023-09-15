package p0915_test;

import java.util.Scanner;

public class J02 {

	public static void main(String[] args) {
		//4개의 숫자를 입력받아, JMethod cal2메소드를 만들어
		//4개 숫자 더하기와 곱하기를 한 결과값을 main에서 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		//1. 변수사용
//		System.out.println("1번째 숫자를 입력하세요.");
//		int nn1 = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하세요.");
//		int nn2 = scan.nextInt();
//		System.out.println("3번째 숫자를 입력하세요.");
//		int nn3 = scan.nextInt();
//		System.out.println("4번째 숫자를 입력하세요.");
//		int nn4 = scan.nextInt();
//		
//		JMethod2 j = new JMethod2();
//		int result = j.cal(nn1, nn2, nn3, nn4);
//		System.out.println("결과갑 : "+result);
		
		
		
		//2. 배열사용
		int[] n = new int[4];
		for(int i=0;i<n.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.\n",i+1);
			n[i] = scan.nextInt();
		}
		
		JMethod2 j = new JMethod2();
//		int result = j.cal(n[0], n[1], n[2], n[3]);
		int result = j.cal2(n);
		System.out.println("결과갑 : "+result);
		
		

	}//main

}//class

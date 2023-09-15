package p0915_학생성적;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction(); //객체선언
		int stuCount = 1;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		
		//무한반복
		while(true) {
			//메인화면 출력부분
			int choice = stuAction.mainPrint();
			
			switch(choice) {
			case 1: 
				//1. 학생입력 메소드
				stuCount = stuAction.stuInput(stuCount);
				break;
				
			case 2 :
				//2. 학생성적출력 메소드
				stuAction.stuOutput();
				break;
				
			case 3 :
				//3. 학생성적수정 메소드
				
				break;
				
				
			}//switch
		}//while
		
		
		
		
		
	}//main
}//class

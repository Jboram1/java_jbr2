package p0925;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> list = new ArrayList();
		StuAction s = new StuAction();
		int choice = 0;
		
		loop:while(true) {
			System.out.println("-----------------------------");
			System.out.println("     [ 학생성적처리 프로그램 ]");
			System.out.println("-----------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			System.out.println("5. 이름순 정렬");
			System.out.println("6. 성적높은순 정렬");
			System.out.println("7. 성적낮은순 정렬");
			System.out.println("8. 파일가져오기");
			System.out.println("9. 파일저장");
			System.out.println("10. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------------");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1 :
				s.stuInput();
				break;
				
			case 2 :
				s.stuOutput();
				break;
				
			case 3 :
				s.stuUpdate();
				break;
				
			case 4 :
				s.stuDelete();
				break;
				
			case 5 :
				
				
				
				
				
				
				
				
				
			case 0 :
				System.out.println("[[프로그램 종료]]");
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;
				
			}//switch
			
			
		}//while
		
		
		
	}//main

}//class

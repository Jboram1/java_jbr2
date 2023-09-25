package p0922_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	
	ArrayList<StuScore> list = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	//1.
	void stuInput() {
		while(true) {
			int count = list.size()+1;
			System.out.println("[[학생성적입력]]");
			System.out.println(count+"번째 학생이름을 입력하세요(0. 이전페이지 이동");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전페이지로 이동합니다!!");
				System.out.println();
				break;
			}
			System.out.println("국어성적을 입력하세요.>>");
			int kor = scan.nextInt();
			System.out.println("영어성적을 입력하세요.>>");
			int eng = scan.nextInt();
		
		}
	}

	
	
	
}//class

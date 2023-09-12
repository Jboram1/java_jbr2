package p0912;

import java.util.Scanner;

public class J0911_03 {

	public static void main(String[] args) {
		// 3명의 학생을 입력받아 출력하시오.
		//StuScore2
		Scanner scan = new Scanner(System.in);
		int stuNo2 =0;
		String name2 ="";
		int kor2=0,eng2=0,math2=0;
		int [] score2 = new int[3];
		String [] subject2 = {"국어","영어","수학"};
		StuScore2 [] s2 = new StuScore2[3];
		
		
		for(int i=0;i<score2.length;i++) {
			stuNo2 = i+1;
			System.out.println("이름을 입력하세요.");
			name2 = scan.next();
			
			System.out.println("국어점수를 입력하세요.");
			kor2 = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng2 = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math2 = scan.nextInt();
			s2[i] = new StuScore2(stuNo2,name2,kor2,eng2,math2);
		}
		
		
		for(int i=0;i<s2.length;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s2[i].stuNo2, s2[i].name2, s2[i].kor2, s2[i].eng2, s2[i].math2,
					s2[i].total2, s2[i].avg2);
		}

	}

}

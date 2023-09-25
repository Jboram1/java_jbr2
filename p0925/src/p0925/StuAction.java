package p0925;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuAction {
	
	ArrayList<StuScore> list = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	
	
	//1. 학생생적입력
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
				System.out.println("수학성적을 입력하세요.>>");
				int math = scan.nextInt();
				list.add(new StuScore(name,kor,eng,math));
				System.out.println("학생성적이 저장되었습니다.");
				System.out.println();
			}	//while
			}//stuInput
	
		//2. 학생성적출력
		void stuOutput() {
			System.out.println("[[학생성적출력]]");
			System.out.println("---------------------------");
			System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("---------------------------");
			for(int i=0;i<list.size();i++) {
				StuScore st = list.get(i);
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f%\td\n",
						st.getStuNum(),st.getName(),st.getKor(),st.getEng(),st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
			}
		}//stuOutput
		
		
		//3. 학생성적수정
		void stuUpdate() {
			while(true) {
				System.out.println("[[학생성적수정]]");
				System.out.println("수정할 학생이름을 입력하세요.>>(0.이전페이지 이동)");
				String inputName = scan.next();
				if(inputName.equals("0")) {
					System.out.println("이전페이지로 이동합니다!!");
					System.out.println();
					break;
				}
				System.out.println("입력된 이름으로 검색중...");
				int i = 0;
				int count = 0;
				for(i=0;i<list.size();i++) {
					StuScore st = list.get(i);
					if(inputName.equals(st.getName())) {
						System.out.println("입력된 이름으로 학생이 검색되었습니다!!");
						continue;
					}//if
					System.out.println("===============");
					System.out.println("1. 국어점수");
					System.out.println("2. 영어점수");
					System.out.println("3. 수학점수");
					System.out.println("===============");
					System.out.println("원하는 번호를 입력하세요.");
					int choice = scan.nextInt();
					switch(choice) {
					case 1 :
						System.out.println("[[ 국어점수 수정 ]]");
						System.out.println("=====================");
						System.out.println("● 현재 국어점수 : "+list.get(i).getKor());
						System.out.println("변경할 국어점수를 입력하세요.");
						list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
						list.get(i).setAvg(list.get(i).getTotal()/3.0);
						System.out.println("=====================");
						System.out.println(list.get(i).getKor()+"점으로 국어점수가 수정되었습니다.");
						System.out.println();
						break;
						
					case 2 :
						System.out.println("[[ 영어점수 수정 ]]");
						System.out.println("=====================");
						System.out.println("● 현재 영어점수 : "+list.get(i).getEng());
						System.out.println("변경할 영어점수를 입력하세요.");
						list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
						list.get(i).setAvg(list.get(i).getTotal()/3.0);
						System.out.println("=====================");
						System.out.println(list.get(i).getEng()+"점으로 영어점수가 수정되었습니다.");
						System.out.println();
						break;
						
					case 3 :
						System.out.println("[[ 수학점수 수정 ]]");
						System.out.println("=====================");
						System.out.println("● 현재 수학점수 : "+list.get(i).getMath());
						System.out.println("변경할 수학점수를 입력하세요.");
						list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
						list.get(i).setAvg(list.get(i).getTotal()/3.0);
						System.out.println("=====================");
						System.out.println(list.get(i).getMath()+"점으로 수학점수가 수정되었습니다.");
						System.out.println();
						break;
					}//switch
				}//while
			}
		}//stuUpdate
		
		
		//4. 학생성적삭제
		void stuDelete() {
			while(true) {
				System.out.println("[[학생성적삭제]]");
				System.out.println("삭제할 학생이름을 입력하세요.(0.이전페이지 이동)");
				String inputName = scan.next();
				if(inputName.equals("0")) {
					System.out.println("이전페이지로 이동합니다!");
					System.out.println();
					break;
				}//if
				System.out.println("입력된 이름으로 검색중...");
				int i =0;
				int count = 0;
				for(i=0;i<list.size();i++) {
					StuScore st = list.get(i);
					if(inputName.equals(st.getName())) {
						System.out.println("입력된 이름으로 학생이 검색되었습니다.");
						count = 1;
						break;
					}//if
				}//for
				if(count==0) {
					System.out.println("학생이 검색되지 않았습니다. 다시 입력하세요.");
					continue;
				}
				System.out.println("----------------------------------");
				System.out.println("1. 학생성적 삭제");
				System.out.println("2. 학생성적 삭제취소");
				System.out.println("----------------------------------");
				System.out.println("원하는 번호를 입력하세요.");
				int choice = scan.nextInt();
				switch(choice) {
				case 1 :
					System.out.println("[[학생성적 삭제]]");
					System.out.println(inputName+"학생성적이 삭제되었습니다.");
					list.remove(i);
					System.out.println();
					break;
					
				case 2 :
					System.out.println("[[학생성적 삭제취소]]");
					System.out.println("-----------------------");
					System.out.println("학생성적 삭제가 취소되었습니다.");
					System.out.println();
					break;
				}//while
			}//switch
		}//stuDelete
	
		
		//5. 이름순 정렬(순차정렬
		void stuNameSort() {
			Collections.sort(list, new Comparator<StuScore>() {

				@Override
				public int compare(StuScore s1, StuScore s2) {
					return s1.getName().compareTo(s2.getName());
				}
				
			});
		}//stuNameSort
		
		
		
		//6. 성적높은순 정렬
			
}//class

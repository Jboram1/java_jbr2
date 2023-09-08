package p0908;

import java.util.Arrays;
import java.util.Scanner;

public class J0908_01_로또 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1.
		int [] lotto = new int[45];
		int [] myNo = new int[6];
		int [] winLo = new int[6];
		int [] myWin = new int [6]; //내가 당첨 된 번호
		int temp =0, count=0;
		
		//2.
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		//3.
		for(int i=0;i<500;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		//4.
		for(int i=0;i<6;i++) {
			winLo[i] = lotto[i];
		}
		
		System.out.println(Arrays.toString(winLo));
		System.out.println("-----------------------------");
		System.out.println("-------  로 또 번 호  ---------");
		System.out.println("-----------------------------");
		
		//5.
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요.");
			myNo[i] = scan.nextInt();
		}
		System.out.println("-----------------------------");
		System.out.println("--------  당 첨 확 인  --------");
		System.out.println("-----------------------------");
		System.out.println();
		
		
		//6.
		
		System.out.print("★ 당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",winLo[i]);
		}
		System.out.println();
		
		
		//7.
		System.out.print("♥ 나의번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",myNo[i]);
		}
		System.out.println();
		
		
		//8.
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(winLo[i]==myNo[j]) {
					myWin[count]=winLo[i];  //[i] 번호가 똑바로 안 들어감. count를 넣어줘야한다.
					count++;
					break;
				}
			}
		}
		System.out.println("※ 당첨개수 : "+count);
		
		
		
		//9. 본인이 맞춘 당첨번호 출력
		System.out.print("◆ 맞춘 당첨번호 : ");
		for(int i=0;i<count;i++) {
			System.out.printf("%d ",myWin[i]);
		}
		System.out.println();
		

	} //main
}//class

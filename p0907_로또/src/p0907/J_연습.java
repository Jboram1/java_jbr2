package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J_연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1.
		int[] lotto = new int[45];
		int[] myNo = new int[6];
		int[] winLo = new int[6];
		int temp =0, count = 0;
		
		
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
		System.out.println("------------------------");
		System.out.println("------ 로 또 확 인 --------");
		System.out.println("------------------------");
		
		//5.
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를입력하세요.");
			myNo[i] = scan.nextInt();
		}
		System.out.println("------------------------");
		System.out.println("------- 당 첨 확 인 ------");
		System.out.println("------------------------");
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
					count++;
					break;
				}
			}
		}
		System.out.println("※ 당첨개수 : "+count);

	}//main
}//class

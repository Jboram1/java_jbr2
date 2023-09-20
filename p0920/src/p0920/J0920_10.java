package p0920;

public class J0920_10 {

	public static void main(String[] args) {

		String str = "swim,golf,book,run,game";
		// 배열에 담아 출력하시오.
		String[] hobby = str.split(",");
		for(int i=0;i<hobby.length;i++) {
			System.out.println(hobby[i]);
		}
		
		
		String str2 = "수영/골프/독서/조깅/게임";
		String[] hobby2 = str2.split("/");
		for(int i=0;i<hobby2.length;i++) {
			System.out.println(hobby2[i]);
		}
		
		String str3 = "수영 골프 독서 조깅 게임";
		String[] hobby3 = str3.split(" ");
		for(int i=0;i<hobby3.length;i++) {
			System.out.println(hobby3[i]);
		}
		
		String str4 = "자바-파이썬-C-자바스크립트-리엑트";
		String[] subject = str4.split("-");
		for(String h4:subject) {
			System.out.println(h4);
		}
		
		
	}//main

}//class

package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_08 {

	public static void main(String[] args) {
		//파일 1개 생성 - File객체 폴더, 파일을 생성할 수 있음.
		//폴더 생성
		File f = new File("c:/abc");
		f.mkdir();
		System.out.println("폴더가 생성 되었습니다.");
		
		File fFile = new File("c:/abc/1.txt");
			try {
				fFile.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("프로그램을 끝마칩니다.");
			}
		
		
		
	}//main

}//class

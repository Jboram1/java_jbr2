package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J0919_15 {

	public static void main(String[] args) throws Exception {
		//lee1, lee2 -> bbb폴더 2개를 복사하시오.
		File f = new File("c:/bbb");
		if(!f.exists()) {//폴더가 없으면
			f.mkdir();   //폴더를 생성
		}
		
		FileInputStream fis = new FileInputStream("c:/aaa/lee1.jpg");
		FileOutputStream fos = new FileOutputStream("c:/bbb/lee1.jpg");
		FileInputStream fis2 = new FileInputStream("c:/aaa/lee2.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/bbb/lee2.jpg");
		
		while(true) {
			int read = fis.read(); //파일을 byte단위로 읽어오기
			if(read==-1) break;    //파일이 더 이상 읽을게 없으면 멈춤.
			fos.write(read);       //파일을 byte단위로 저장
		
			read = fis2.read(); //파일을 byte단위로 읽어오기
			if(read==-1) break;    //파일이 더 이상 읽을게 없으면 멈춤.
			fos2.write(read);  
			
			
		}
		fis.close();//끝
		fos.close();//끝
		fis2.close();//끝
		fos2.close();//끝
		
		System.out.println("파일이 복사 되었습니다.");
		
		
		
		
		
		
	}//main

}//class

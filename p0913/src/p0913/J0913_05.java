package p0913;

import java.util.Calendar;
import java.util.Date;

public class J0913_05 {

	public static void main(String[] args) {
		
//		Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		s.setHour(10);
		s.setMinute(5);
		s.setSecond(40);
		System.out.printf("%d시%d분%d초 \n",s.getHour(),s.getMinute(),s.getSecond());
		
		
		Singleton s2 = Singleton.getInstance();
		s2.setHour(12);
		s2.setMinute(12);
		s2.setSecond(12);
		System.out.printf("%d시%d분%d초 \n",s2.getHour(),s2.getMinute(),s2.getSecond());
		System.out.printf("%d시%d분%d초 \n",s.getHour(),s.getMinute(),s.getSecond());
		
	}

}

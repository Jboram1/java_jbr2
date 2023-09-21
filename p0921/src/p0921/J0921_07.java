package p0921;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class J0921_07 {

	public static void main(String[] args) {
		
		//list - 순서O, 중복O
		//순서X, 중복X
		HashSet<String> set = new HashSet<String>();
		set.add("c");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("b");
		set.add("a");
		
		
		

		
		// Iterator 최신버전 - iterator(), hasNext(), next()
		Iterator<String> it = set.iterator(); //1회성, 한번 출력만 가능
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------");
		
		Iterator<String> it2 = set.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("완료!!");
		
		//Iterator 구버전 - elements(), hasMoreElements(), nextElement()
//		Enumeration<Integer> e = v.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
		
//
//		
////		list.remove(5);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		
//		for(int i=list.size()-1;i>=0;i--) {
//			list.remove(i);
//		}
//		
//		
//		System.out.println("--------------------------");
//		
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
	
	}

}

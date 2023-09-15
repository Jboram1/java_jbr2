package p0915_test;

public class JMethod2 {
	
	
	JMethod2(){
		
	}
	
	int cal(int nn1, int nn2, int nn3, int nn4) {
		int result = nn1+nn2+nn3+nn4;
		int result2 = nn1*nn2*nn3*nn4;
		
		return result+result2;
	}

	int cal2(int[] n) {
		int result = n[0]+n[1]+n[2]+n[3];
		int result2 = n[0]*n[1]*n[2]*n[3];
		
		return result+result2;
	}
	
	
}

package p0915_test;

public class JMethod {
	
	JMethod(){ //생성자
		
	}
	
	//인스턴스메소드
	int calculate(int n1, int n2) {//(int 이름은 무엇이든 상관없다
		//입력받은 2개의 숫자를 4칙연산
		int result = n1+n2;
		int result2 = n1-n2;
		int result3 = n1*n2;
		int result4 = n1/n2;
		
		return result+result2+result3+result4;
		
	}//calculate

}
